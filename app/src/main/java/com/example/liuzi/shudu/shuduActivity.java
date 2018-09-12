package com.example.liuzi.shudu;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.socks.library.KLog;

public class shuduActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText s00,s01,s02,s03,s04,s05,s06,s07,s08,
            s10,s11,s12,s13,s14,s15,s16,s17,s18,
            s20,s21,s22,s23,s24,s25,s26,s27,s28,
            s30,s31,s32,s33,s34,s35,s36,s37,s38,
            s40,s41,s42,s43,s44,s45,s46,s47,s48,
            s50,s51,s52,s53,s54,s55,s56,s57,s58,
            s60,s61,s62,s63,s64,s65,s66,s67,s68,
            s70,s71,s72,s73,s74,s75,s76,s77,s78,
            s80,s81,s82,s83,s84,s85,s86,s87,s88;
    private EditText[][] Edit=new EditText[9][9];
    private Button start,reset;

    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {

            super.handleMessage(msg);
            if (msg.what == 100) {

                putIn();          //输入并计算

            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shudu);
        init();             //初始化
    }

    private void init(){
        s00=(EditText)findViewById(R.id.s00);s01=(EditText)findViewById(R.id.s01);s02=(EditText)findViewById(R.id.s02);s03=(EditText)findViewById(R.id.s03);
        s04=(EditText)findViewById(R.id.s04);s05=(EditText)findViewById(R.id.s05);s06=(EditText)findViewById(R.id.s06);s07=(EditText)findViewById(R.id.s07);
        s08=(EditText)findViewById(R.id.s08);
        s10=(EditText)findViewById(R.id.s10);s11=(EditText)findViewById(R.id.s11);s12=(EditText)findViewById(R.id.s12);s13=(EditText)findViewById(R.id.s13);
        s14=(EditText)findViewById(R.id.s14);s15=(EditText)findViewById(R.id.s15);s16=(EditText)findViewById(R.id.s16);s17=(EditText)findViewById(R.id.s17);
        s18=(EditText)findViewById(R.id.s18);
        s20=(EditText)findViewById(R.id.s20);s21=(EditText)findViewById(R.id.s21);s22=(EditText)findViewById(R.id.s22);s23=(EditText)findViewById(R.id.s23);
        s24=(EditText)findViewById(R.id.s24);s25=(EditText)findViewById(R.id.s25);s26=(EditText)findViewById(R.id.s26);s27=(EditText)findViewById(R.id.s27);
        s28=(EditText)findViewById(R.id.s28);
        s30=(EditText)findViewById(R.id.s30);s31=(EditText)findViewById(R.id.s31);s32=(EditText)findViewById(R.id.s32);s33=(EditText)findViewById(R.id.s33);
        s34=(EditText)findViewById(R.id.s34);s35=(EditText)findViewById(R.id.s35);s36=(EditText)findViewById(R.id.s36);s37=(EditText)findViewById(R.id.s37);
        s38=(EditText)findViewById(R.id.s38);
        s40=(EditText)findViewById(R.id.s40);s41=(EditText)findViewById(R.id.s41);s42=(EditText)findViewById(R.id.s42);s43=(EditText)findViewById(R.id.s43);
        s44=(EditText)findViewById(R.id.s44);s45=(EditText)findViewById(R.id.s45);s46=(EditText)findViewById(R.id.s46);s47=(EditText)findViewById(R.id.s47);
        s48=(EditText)findViewById(R.id.s48);
        s50=(EditText)findViewById(R.id.s50);s51=(EditText)findViewById(R.id.s51);s52=(EditText)findViewById(R.id.s52);s53=(EditText)findViewById(R.id.s53);
        s54=(EditText)findViewById(R.id.s54);s55=(EditText)findViewById(R.id.s55);s56=(EditText)findViewById(R.id.s56);s57=(EditText)findViewById(R.id.s57);
        s58=(EditText)findViewById(R.id.s58);
        s60=(EditText)findViewById(R.id.s60);s61=(EditText)findViewById(R.id.s61);s62=(EditText)findViewById(R.id.s62);s63=(EditText)findViewById(R.id.s63);
        s64=(EditText)findViewById(R.id.s64);s65=(EditText)findViewById(R.id.s65);s66=(EditText)findViewById(R.id.s66);s67=(EditText)findViewById(R.id.s67);
        s68=(EditText)findViewById(R.id.s68);
        s70=(EditText)findViewById(R.id.s70);s71=(EditText)findViewById(R.id.s71);s72=(EditText)findViewById(R.id.s72);s73=(EditText)findViewById(R.id.s73);
        s74=(EditText)findViewById(R.id.s74);s75=(EditText)findViewById(R.id.s75);s76=(EditText)findViewById(R.id.s76);s77=(EditText)findViewById(R.id.s77);
        s78=(EditText)findViewById(R.id.s78);
        s80=(EditText)findViewById(R.id.s80);s81=(EditText)findViewById(R.id.s81);s82=(EditText)findViewById(R.id.s82);s83=(EditText)findViewById(R.id.s83);
        s84=(EditText)findViewById(R.id.s84);s85=(EditText)findViewById(R.id.s85);s86=(EditText)findViewById(R.id.s86);s87=(EditText)findViewById(R.id.s87);
        s88=(EditText)findViewById(R.id.s88);
        Edit[0][0]=s00;Edit[0][1]=s01;Edit[0][2]=s02;Edit[0][3]=s03;Edit[0][4]=s04;Edit[0][5]=s05;Edit[0][6]=s06;Edit[0][7]=s07;Edit[0][8]=s08;
        Edit[1][0]=s10;Edit[1][1]=s11;Edit[1][2]=s12;Edit[1][3]=s13;Edit[1][4]=s14;Edit[1][5]=s15;Edit[1][6]=s16;Edit[1][7]=s17;Edit[1][8]=s18;
        Edit[2][0]=s20;Edit[2][1]=s21;Edit[2][2]=s22;Edit[2][3]=s23;Edit[2][4]=s24;Edit[2][5]=s25;Edit[2][6]=s26;Edit[2][7]=s27;Edit[2][8]=s28;
        Edit[3][0]=s30;Edit[3][1]=s31;Edit[3][2]=s32;Edit[3][3]=s33;Edit[3][4]=s34;Edit[3][5]=s35;Edit[3][6]=s36;Edit[3][7]=s37;Edit[3][8]=s38;
        Edit[4][0]=s40;Edit[4][1]=s41;Edit[4][2]=s42;Edit[4][3]=s43;Edit[4][4]=s44;Edit[4][5]=s45;Edit[4][6]=s46;Edit[4][7]=s47;Edit[4][8]=s48;
        Edit[5][0]=s50;Edit[5][1]=s51;Edit[5][2]=s52;Edit[5][3]=s53;Edit[5][4]=s54;Edit[5][5]=s55;Edit[5][6]=s56;Edit[5][7]=s57;Edit[5][8]=s58;
        Edit[6][0]=s60;Edit[6][1]=s61;Edit[6][2]=s62;Edit[6][3]=s63;Edit[6][4]=s64;Edit[6][5]=s65;Edit[6][6]=s66;Edit[6][7]=s67;Edit[6][8]=s68;
        Edit[7][0]=s70;Edit[7][1]=s71;Edit[7][2]=s72;Edit[7][3]=s73;Edit[7][4]=s74;Edit[7][5]=s75;Edit[7][6]=s76;Edit[7][7]=s77;Edit[7][8]=s78;
        Edit[8][0]=s80;Edit[8][1]=s81;Edit[8][2]=s82;Edit[8][3]=s83;Edit[8][4]=s84;Edit[8][5]=s85;Edit[8][6]=s86;Edit[8][7]=s87;Edit[8][8]=s88;

        start=(Button)findViewById(R.id.slove);
        reset=(Button)findViewById(R.id.reset);

        reset.setOnClickListener(this);
        start.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.reset:
               reset(v);       //重置
                break;
            case R.id.slove:
                slove(v);      //计算
                break;
            default:
        }

    }


    public void slove(View v) {


        new Thread(new Runnable() {
            @Override
            public void run() {
                mHandler.sendEmptyMessage(100);
            }
        }).start();        //展开线程，分担主线程任务

    }

    public void putIn(){
        boolean[][] cols = new boolean[9][9];             //设置行，列，九宫格的标志位
        boolean[][] rows = new boolean[9][9];
        boolean[][] blocks = new boolean[9][9];
        int[][] suduku=new int[9][9];                  //设置数独坐标
        int sum_duplicate=0;     //查重


        for (int i=0;i<9;i++){                               //初始化
            for (int j=0;j<9;j++){
                if (Edit[i][j].getText().toString().equals("")){        //为空时值为零
                    suduku[i][j]=0;
                }else {
                    suduku[i][j] = Integer.parseInt(Edit[i][j].getText().toString());          //获取已输入的坐标值
                    int k = i/3*3+ j/3;//划分九宫格,这里以行优先
                    int val=suduku[i][j]-1;
                    rows[i][val] = true;            //已输入的为true
                    cols[j][val] = true;
                    blocks[k][val] = true;
                }
               // KLog.d(String.valueOf(i)+"  "+String.valueOf(j)+"  "+String.valueOf(suduku[i][j]));
                if (check_duplicate(suduku,i,j,suduku[i][j])==false){
                    sum_duplicate++;
                    KLog.d(String.valueOf("次数"+sum_duplicate));
                }
            }
        }
        if (check(suduku)==false){                       //判断输入数独是否为空
            Toast.makeText(this,"请填入数字",Toast.LENGTH_SHORT).show();
        }else {
            if (sum_duplicate!=0) {
                Toast.makeText(this,"输入内容不符合规范",Toast.LENGTH_SHORT).show();

            } else {

                boolean result_flag=DFS(suduku, cols, rows, blocks);
                if(result_flag!=true){
                    Toast.makeText(this,"无解，请重新输入",Toast.LENGTH_SHORT).show();
                }else {

                    complete(suduku);            //完成输出
                }
            }
        }



    }

    public void complete(int[][] a){              //输出数独结果显示界面
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                Edit[i][j].setText(String.valueOf(a[i][j]));
            }

        }


        KLog.d("完成");
       // th=0;

    }

    public boolean check(int[][] a){                //检查用户是否未输入
        int x=0;
        for (int i=0;i<9;i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == 0){
                    x++;
                }
            }
        }
        if (x==81){
            return false;
        }else{
            return true;
        }
    }

    public boolean check_duplicate (int[][] a,int a_row, int a_column, int number) {
        //判断该行该列是否有重复数字
        if (number!=0) {
            KLog.d(String.valueOf(a_row)+"  "+String.valueOf(a_column)+"   "+String.valueOf(number));
            for (int i = 0; i < 9; i++) {
                for (int j = 0;j < 9;j++){
                    if (a[i][a_column] == number||a[a_row][j]==number) {
                        if (j == a_column || i==a_row)
                        {}else {

                            return false;
                        }
                    }
                }
            }

            //判断小九宫格是否有重复
            int tempRow = a_row / 3;
            int tempLine = a_column / 3;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if ((tempRow * 3 + i) != a_row && (tempLine * 3 + j) != a_column) {
                        if (a[tempRow * 3 + i][tempLine * 3 + j] == number) {
                            return false;
                        }
                    }
                }
            }
        }
            return true;

    }


    public void reset(View v){
        s00.setText("");s01.setText("");s02.setText("");s03.setText("");s04.setText("");s05.setText("");        //重置所有空格
        s06.setText("");s07.setText("");s08.setText("");s10.setText("");s11.setText("");s12.setText("");
        s13.setText("");s14.setText("");s15.setText("");s16.setText("");s17.setText("");s18.setText("");
        s20.setText("");s21.setText("");s22.setText("");s23.setText("");s24.setText("");s25.setText("");
        s26.setText("");s27.setText("");s28.setText("");s30.setText("");s31.setText("");s32.setText("");
        s33.setText("");s34.setText("");s35.setText("");s36.setText("");s37.setText("");s38.setText("");
        s40.setText("");s41.setText("");s42.setText("");s43.setText("");s44.setText("");s45.setText("");
        s46.setText("");s47.setText("");s48.setText("");s50.setText("");s51.setText("");s52.setText("");
        s53.setText("");s54.setText("");s55.setText("");s56.setText("");s57.setText("");s58.setText("");
        s60.setText("");s61.setText("");s62.setText("");s63.setText("");s64.setText("");s65.setText("");
        s66.setText("");s67.setText("");s68.setText("");s70.setText("");s71.setText("");s72.setText("");
        s73.setText("");s74.setText("");s75.setText("");s76.setText("");s77.setText("");s78.setText("");
        s80.setText("");s81.setText("");s82.setText("");s83.setText("");s84.setText("");s85.setText("");
        s86.setText("");s87.setText("");s88.setText("");

    }



    public static boolean DFS(int[][] a,boolean[][] cols,boolean[][] rows,boolean[][] blocks) {           //深度优先搜索回溯法计算
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(a[i][j]==0){
                    int k=i/3*3+j/3;
                    for (int l = 0; l < 9; l++) {
                        if(!cols[j][l]&&!rows[i][l]&&!blocks[k][l]){//l对于的数字l+1没有在行列块中出现
                            rows[i][l] = cols[j][l] = blocks[k][l] = true;
                            a[i][j] = 1 + l;//下标加1
                            if(DFS(a, cols, rows, blocks)) return true;//递进则返回true
                            rows[i][l] = cols[j][l] = blocks[k][l] = false;//递进失败则回溯
                            a[i][j] = 0;
                        }
                    }
                    return false;//a[i][j]==0时，l发现都不能填进去
                }//the end of a[i][j]==0
            }
        }
        return true;//没有a[i][j]==0,则返回true
    }


}
