package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class InfixToPostfix {
    private int inStackPriority(char operator) {
        if (operator == '+' || operator == '-') return 1;
        else if (operator == '*' || operator == '/') return 2;
        else if (operator == '(') return 0;
        else throw new IllegalArgumentException("not allowed argument");
    }

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        //결과를 담을 StringBuilder
        StringBuilder answer = new StringBuilder();
        Stack<Character> stack= new Stack<>();
/*숫자 -> 바로 출력
연산자 조건
1. 비어있으면 스택에 추가
2. 비어있지 않으면 top과 token를 비교해서 연산자 우선순위가 높으면  push
    우선순위가 낮으면 pop
3. 여는 괄호 -> push (우선순위 최하위)
4. 닫는 괄호 -> (여는 괄호가 나올떄까지 stack에서 pop)*/
        for (int i=0; i<input.length(); i++){ //5+3*1+(4-9)*3
            char token = input.charAt(i);
            if(Character.isAlphabetic(token)){
                answer.append(token);
            } else{  //숫자가 아니면
                if(stack.isEmpty()){ //스텍이 비어있으면
                    stack.push(token);
                } else { //스텍이 비어있지 않을때
                    if(token=='('){
                        stack.push(token);
                        continue;
                    } else if (token==')'){
                        while(true){
                            char top = stack.peek();
                            char popOp =stack.pop();
                            if(top=='(') break;
                            answer.append(popOp);
                           // System.out.println(1);
                        }

                        continue;
                    }

                    char top = stack.peek();
                    if(inStackPriority(top)<inStackPriority(token)){ //2-1 조건
                        stack.push(token);
                    } else{ //2-2조건
                        while(inStackPriority(token)<=inStackPriority(top)){
                          //  System.out.println(top);
                          //  System.out.print(answer);
                            answer.append(stack.pop());
                            if(!stack.isEmpty()){
                                top=stack.peek();
                            } else {
                                stack.push(token);
                                break;
                            }

                        }
                    }
                }
            }
        }
        while(!stack.isEmpty()) answer.append(stack.pop());
        System.out.print(answer);
    }

    public static void main(String[] args) throws IOException {
        new InfixToPostfix().solution();
    }
}
