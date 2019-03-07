package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Word[] words = new Word[5];
        System.out.println("わからない単語とその意味をスペースで区切って入力してください");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int index = 0;

            while (!input.equals("e")) {
            String[] tmp = input.split(" ");
            Word wd = new Word(tmp[0], tmp[1]);
            words[index] = wd;
            index++;
            System.out.println("次の単語と意味を入力してください。\"e\"で終了します。");
            input = sc.nextLine();

        try{
            words[index] = wd;
        }catch(IndexOutOfBoundsException e){
            System.out.println("登録制限を超えました。登録済みのデータは以下になります。");
            break;
        }
            }

        for (int i = 0; i < index; i++) {
            System.out.println("単語:" + words[i].word + "意味:" + words[i].meaning);
        }
        System.out.println(index + "件、登録しました。");
    }
}
