package com.example.b2101029_r1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    Button btnAdd, btnDiv, btnSub, btnMul;
    TextView textResult;

    String num1, num2;
    Double result;

    Button[] numButtons = new Button[11];
    Integer[] numBtnIDs = {R.id.btnNum0,R.id.btnNum1,R.id.btnNum2,R.id.btnNum3,R.id.btnNum4,
            R.id.btnNum5,R.id.btnNum6,R.id.btnNum7,R.id.btnNum8,R.id.btnNum9,R.id.btnNum10};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);
        btnAdd = (Button) findViewById(R.id.BtnAdd);
        btnDiv = (Button) findViewById(R.id.BtnDiv);
        btnSub = (Button) findViewById(R.id.BtnSub);
        btnMul = (Button) findViewById(R.id.BtnMul);
        textResult =(TextView) findViewById(R.id.TextResult);

        for(int i = 0; i< numBtnIDs.length; i++){
            numButtons[i] =  (Button) findViewById(numBtnIDs[i]);
        }

        for(int i = 0; i< numBtnIDs.length; i++){
            final int index;
            index = i;
            numButtons[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(edit1.isFocused()==true) {
                        num1 = edit1.getText().toString()
                                + numButtons[index].getText().toString();
                        edit1.append(numButtons[index].getText().toString());

                    } else if (edit2.isFocused()==true){
                        num2 = edit2.getText().toString()
                                + numButtons[index].getText().toString();
                        edit2.append(numButtons[index].getText().toString());
                    } else {
                        Toast.makeText(getApplicationContext(),
                                "에디트 텍스트를 선택하세요",
                                Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Double.parseDouble(num1) + Double.parseDouble(num2);
                    textResult.setText("계산 결과: "+result.toString());
                } catch (Exception e){
                    //에러 발생시 실행할 문장
                    Toast.makeText(getApplicationContext(),"입력 오류입니다.",
                            Toast.LENGTH_SHORT).show();
                    textResult.setText("계산 결과: "+"입력 오류입니다.");
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Double.parseDouble(num1) - Double.parseDouble(num2);
                    textResult.setText("계산 결과: "+result.toString());
                } catch (Exception e){
                    //에러 발생시 실행할 문장
                    Toast.makeText(getApplicationContext(),"입력 오류입니다.",
                            Toast.LENGTH_SHORT).show();
                    textResult.setText("계산 결과: "+"입력 오류입니다.");
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Double.parseDouble(num1) * Double.parseDouble(num2);
                    textResult.setText("계산 결과: "+result.toString());
                } catch (Exception e){
                    //에러 발생시 실행할 문장
                    Toast.makeText(getApplicationContext(),"입력 오류입니다.",
                            Toast.LENGTH_SHORT).show();
                    textResult.setText("계산 결과: "+"입력 오류입니다.");
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    if (num2.trim().equals("0")) {
                        textResult.setText("계산 결과: " + "0으로 나눌 수 없습니다.");
                    } else {
                        result = Double.parseDouble(num1) / Double.parseDouble(num2);
                        textResult.setText("계산 결과: " + result.toString());
                    }
                } catch (Exception e) {
                    //에러 발생시 실행할 문장
                    Toast.makeText(getApplicationContext(), "입력 오류입니다.",
                            Toast.LENGTH_SHORT).show();
                    textResult.setText("계산 결과: " + "입력 오류입니다.");
                }
            }
        });
    }
}