package co.id.merakjaya.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnSatu,btnDua,btnTiga,btnEmpat,btnLima,btnEnam,btnTujuh,btnDelapan,btnSembilan,btnNol;
    private Button btnAc, btnAdd, btnMinus, btnMultiplication, btnDivision, btnEquals;
    private EditText operasi, hasil_et;
    private String numeric_et = "";
//    private String hasil[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*BINDING TIAP ID*/
        /*NUMERIC*/
        btnSatu = (Button) findViewById(R.id.btn_1);
        btnSatu.setOnClickListener(this);
        btnDua = (Button) findViewById(R.id.btn_2);
        btnDua.setOnClickListener(this);
        btnTiga = (Button) findViewById(R.id.btn_3);
        btnTiga.setOnClickListener(this);
        btnEmpat = (Button) findViewById(R.id.btn_4);
        btnEmpat.setOnClickListener(this);
        btnLima = (Button) findViewById(R.id.btn_5);
        btnLima.setOnClickListener(this);
        btnEnam = (Button) findViewById(R.id.btn_6);
        btnEnam.setOnClickListener(this);
        btnTujuh = (Button) findViewById(R.id.btn_7);
        btnTujuh.setOnClickListener(this);
        btnDelapan = (Button) findViewById(R.id.btn_8);
        btnDelapan.setOnClickListener(this);
        btnSembilan = (Button) findViewById(R.id.btn_9);
        btnSembilan.setOnClickListener(this);
        btnNol = (Button) findViewById(R.id.btn_0);
        btnNol.setOnClickListener(this);
        /*END NUMERIC*/

        /*OPERATION*/
        btnAc = (Button) findViewById(R.id.btn_ac);
        btnAc.setOnClickListener(this);
        btnAdd = (Button) findViewById(R.id.btn_add);
        btnAdd.setOnClickListener(this);
        btnMinus = (Button) findViewById(R.id.btn_minus);
        btnMinus.setOnClickListener(this);
        btnMultiplication = (Button) findViewById(R.id.btn_multiplication);
        btnMultiplication.setOnClickListener(this);
        btnDivision = (Button) findViewById(R.id.btn_division);
        btnDivision.setOnClickListener(this);
        btnEquals = (Button) findViewById(R.id.btn_equals);
        btnEquals.setOnClickListener(this);
        /*END OPERATION*/

        /*BINDING EDIT TEXT ATAS*/
        operasi = (EditText) findViewById(R.id.numeric_et);
        hasil_et = (EditText) findViewById(R.id.numeric_result_et);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            /*AREA NUMERIC*/
            case R.id.btn_1:
                //Toast.makeText(getApplicationContext(),"btn 1 :" + operasi.getText().toString(),Toast.LENGTH_SHORT).show();
                if(operasi.getText().toString().equals("0")){
                    operasi.setText("1");
                }
                else{
                    numeric_et = operasi.getText().toString();
                    numeric_et = numeric_et + "1";
                    operasi.setText(numeric_et);
                }
                break;
            case R.id.btn_2:
                //Toast.makeText(getApplicationContext(),"btn 1 :" + operasi.getText().toString(),Toast.LENGTH_SHORT).show();
                if(operasi.getText().toString().equals("0")){
                    operasi.setText("2");
                }
                else{
                    numeric_et = operasi.getText().toString();
                    numeric_et = numeric_et + "2";
                    operasi.setText(numeric_et);
                }
                break;
            case R.id.btn_3:
                //Toast.makeText(getApplicationContext(),"btn 1 :" + operasi.getText().toString(),Toast.LENGTH_SHORT).show();
                if(operasi.getText().toString().equals("0")){
                    operasi.setText("3");
                }
                else{
                    numeric_et = operasi.getText().toString();
                    numeric_et = numeric_et + "3";
                    operasi.setText(numeric_et);
                }
                break;
            case R.id.btn_4:
                //Toast.makeText(getApplicationContext(),"btn 1 :" + operasi.getText().toString(),Toast.LENGTH_SHORT).show();
                if(operasi.getText().toString().equals("0")){
                    operasi.setText("4");
                }
                else{
                    numeric_et = operasi.getText().toString();
                    numeric_et = numeric_et + "4";
                    operasi.setText(numeric_et);
                }
                break;
            case R.id.btn_5:
                //Toast.makeText(getApplicationContext(),"btn 1 :" + operasi.getText().toString(),Toast.LENGTH_SHORT).show();
                if(operasi.getText().toString().equals("0")){
                    operasi.setText("5");
                }
                else{
                    numeric_et = operasi.getText().toString();
                    numeric_et = numeric_et + "5";
                    operasi.setText(numeric_et);
                }
                break;
            case R.id.btn_6:
                //Toast.makeText(getApplicationContext(),"btn 1 :" + operasi.getText().toString(),Toast.LENGTH_SHORT).show();
                if(operasi.getText().toString().equals("0")){
                    operasi.setText("6");
                }
                else{
                    numeric_et = operasi.getText().toString();
                    numeric_et = numeric_et + "6";
                    operasi.setText(numeric_et);
                }
                break;
            case R.id.btn_7:
                //Toast.makeText(getApplicationContext(),"btn 1 :" + operasi.getText().toString(),Toast.LENGTH_SHORT).show();
                if(operasi.getText().toString().equals("0")){
                    operasi.setText("7");
                }
                else{
                    numeric_et = operasi.getText().toString();
                    numeric_et = numeric_et + "7";
                    operasi.setText(numeric_et);
                }
                break;
            case R.id.btn_8:
                //Toast.makeText(getApplicationContext(),"btn 1 :" + operasi.getText().toString(),Toast.LENGTH_SHORT).show();
                if(operasi.getText().toString().equals("0")){
                    operasi.setText("8");
                }
                else{
                    numeric_et = operasi.getText().toString();
                    numeric_et = numeric_et + "8";
                    operasi.setText(numeric_et);
                }
                break;
            case R.id.btn_9:
                //Toast.makeText(getApplicationContext(),"btn 1 :" + operasi.getText().toString(),Toast.LENGTH_SHORT).show();
                if(operasi.getText().toString().equals("0")){
                    operasi.setText("9");
                }
                else{
                    numeric_et = operasi.getText().toString();
                    numeric_et = numeric_et + "9";
                    operasi.setText(numeric_et);
                }
                break;
            case R.id.btn_0:
                //Toast.makeText(getApplicationContext(),"btn 1 :" + operasi.getText().toString(),Toast.LENGTH_SHORT).show();
                if(operasi.getText().toString().equals("0")){
                    operasi.setText("0");
                }
                else{
                    numeric_et = operasi.getText().toString();
                    numeric_et = numeric_et + "0";
                    operasi.setText(numeric_et);
                }
                break;
            /*END AREA NUMERIC*/

            /*AREA BTN OPERATION*/
            case R.id.btn_ac:
                operasi.setText("0");
                hasil_et.setText("0");
                break;
            case R.id.btn_add:
                numeric_et = operasi.getText().toString();
                numeric_et = numeric_et + "+";
                operasi.setText(numeric_et);
                break;
            case R.id.btn_minus:
                numeric_et = operasi.getText().toString();
                numeric_et = numeric_et + "-";
                operasi.setText(numeric_et);
                break;
            case R.id.btn_multiplication:
                numeric_et = operasi.getText().toString();
                numeric_et = numeric_et + "x";
                operasi.setText(numeric_et);
                break;
            case R.id.btn_division:
                numeric_et = operasi.getText().toString();
                numeric_et = numeric_et + ":";
                operasi.setText(numeric_et);
                break;
            case R.id.btn_equals:
                numeric_et = operasi.getText().toString();
                int hasilOperasi=0;
                if(numeric_et.contains("+")){
                    String[] hasil = numeric_et.split("\\+");
                    for(int i=0; i<hasil.length; i++){
                        int bilangan = Integer.parseInt(hasil[i]);
                        hasilOperasi = hasilOperasi + bilangan;
                    }
                    String result = Integer.toString(hasilOperasi);
                    hasil_et.setText(result);
                    operasi.setText(result);
                }
                else if(numeric_et.contains("-")){
                    String[] hasil = numeric_et.split("\\-");
                    for(int i=0; i<hasil.length; i++){
                        int bilangan = Integer.parseInt(hasil[i]);
                        if(i!=0){
                            hasilOperasi = hasilOperasi - bilangan;
                        }
                        else{
                            hasilOperasi = bilangan;
                        }
                    }
                    String result = Integer.toString(hasilOperasi);
                    hasil_et.setText(result);
                    operasi.setText(result);
                }
                else if(numeric_et.contains("x")){
                    hasilOperasi=1;
                    String[] hasil = numeric_et.split("x");
                    for(int i=0; i<hasil.length; i++){
                        int bilangan = Integer.parseInt(hasil[i]);
                        hasilOperasi = hasilOperasi * bilangan;
                    }
                    String result = Integer.toString(hasilOperasi);
                    hasil_et.setText(result);
                    operasi.setText(result);
                }
                else if(numeric_et.contains(":")){
                    hasilOperasi=1;
                    String[] hasil = numeric_et.split(":");
                    for(int i=0; i<hasil.length; i++){
                        int bilangan = Integer.parseInt(hasil[i]);
                        if(i!=0){
                            hasilOperasi = hasilOperasi / bilangan;
                        }
                        else{
                            hasilOperasi = bilangan;
                        }
                    }
                    String result = Integer.toString(hasilOperasi);
                    hasil_et.setText(result);
                    operasi.setText(result);
                }
                break;
            /*END AREA BTN OPERATION*/
        }
    }
}