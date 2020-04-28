package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    //Declaração dos Botões
    Button bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,btMlt,btDvs,btSmr,btSbt,btResul,btLimp,btPont;
    //Declaração do TXT
    EditText editText;
    //Declaração do Teste para poder entrar no cálculo
    boolean Adi,Sub,Mul,Div;
    //Onde serão guardados os números para o cálculo
    float Res1, Res2;

    @SuppressLint("WrongViewCast")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declaração dos botões numerais
        bt0 = (Button) findViewById(R.id.botao0);
        bt1 = (Button) findViewById(R.id.botao1);
        bt2 = (Button) findViewById(R.id.botao2);
        bt3 = (Button) findViewById(R.id.botao3);
        bt4 = (Button) findViewById(R.id.botao4);
        bt5 = (Button) findViewById(R.id.botao5);
        bt6 = (Button) findViewById(R.id.botao6);
        bt7 = (Button) findViewById(R.id.botao7);
        bt8 = (Button) findViewById(R.id.botao8);
        bt9 = (Button) findViewById(R.id.botao9);

        //Declaração dos botões das Operações Aritmétricas
        btMlt = (Button) findViewById(R.id.botaoMult);
        btDvs = (Button) findViewById(R.id.botaoDiv);
        btSmr = (Button) findViewById(R.id.botaoSoma);
        btSbt = (Button) findViewById(R.id.botaoSub);

        //Declaração dos botões Operacionais
        btResul = (Button) findViewById(R.id.botaoResul);
        btLimp = (Button) findViewById(R.id.botaoLimpar);
        btPont = (Button) findViewById(R.id.btPont);

        //Declaração do TXT
        editText = (EditText) findViewById(R.id.textDisplay2);

        //Funções dos botões
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "1");
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
            }
        });

        //Função do ponto
        btPont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + ".");
            }
        });

        //Função dos botões Aritmétricos
        btSmr.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("Assert")
            @Override
            public void onClick(View v) {
                if (editText==null){
                    editText.setText("");
                }
                else{
                    Res1=Float.parseFloat(editText.getText()+""); //Adicionando o primeiro num para o calculo
                    Adi=true;
                    editText.setText(null);
                }
            }
        });

        btMlt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText==null){
                    editText.setText("");
                }
                else{
                    Res1=Float.parseFloat(editText.getText()+"");
                    Mul=true;
                    editText.setText(null);
                }
            }
        });

        btDvs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText==null){
                    editText.setText("");
                }
                else{
                    Res1=Float.parseFloat(editText.getText()+"");
                    Div=true;
                    editText.setText(null);
                }
            }
        });

        btSbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText==null){
                    editText.setText("");
                }
                else{
                    Res1=Float.parseFloat(editText.getText()+"");
                    Sub=true;
                    editText.setText(null);
                }
            }
        });

        //Onde fica os calculos
        btResul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Res2=Float.parseFloat(editText.getText()+""); //Aqui ele adicionará o segundo número
                if(Adi==true){
                    editText.setText(Res1+Res2+"");
                    Adi=false;
                }
                if(Sub==true){
                    editText.setText(Res1-Res2+"");
                    Sub=false;
                }
                if(Mul==true){
                    editText.setText(Res1*Res2+"");
                    Mul=false;
                }
                if(Div==true){
                    editText.setText(Res1/Res2+"");
                    Div=false;
                }
            }
        });

        //Função do botão Limpar
        btLimp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               editText.setText("");
            }
        });

    }
}