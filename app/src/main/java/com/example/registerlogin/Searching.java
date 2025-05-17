package com.example.registerlogin;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Searching extends AppCompatActivity {

    private List<String> list;          // 데이터를 넣은 리스트변수
    private ListView listView;          // 검색을 보여줄 리스트변수
    private EditText editSearch;        // 검색어를 입력할 Input 창
    private SearchingAdapter adapter;      // 리스트뷰에 연결할 어답터
    private ArrayList<String> arraylist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searching);

        editSearch = (EditText) findViewById(R.id.editSearch);
        listView = (ListView) findViewById(R.id.Searchlistview);
        // 커서를 조금 띄운다.
        editSearch.setPadding(40, 40, 40, 40);

        // 리스트를 생성한다.
        list = new ArrayList<String>();

        // 검색에 사용할 데이터을 미리 저장한다.
        settingList();

        // 리스트의 모든 데이터를 arraylist에 복사한다.
        arraylist = new ArrayList<String>();
        // list 복사본을 만든다.
        arraylist.addAll(list);

        // 리스트에 연동될 아답터를 생성한다.
        adapter = new SearchingAdapter(list, this);

        // 리스트뷰에 아답터를 연결한다.
        listView.setAdapter(adapter);

        // input창에 검색어를 입력시 "addTextChangedListener" 이벤트 리스너를 정의한다.
        editSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                // input창에 문자를 입력할때마다 호출된다.
                // search 메소드를 호출한다.
                String text = editSearch.getText().toString();
                search(text);
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;

                String selectedText = list.get(position);

                if (selectedText.equals("일반 종이")) {
                    intent = new Intent(getApplicationContext(), Book2Activity.class);
                    startActivity(intent);
                } else if (selectedText.equals("자석")) {
                    intent = new Intent(getApplicationContext(), Book3Activity.class);
                    startActivity(intent);
                } else if (selectedText.equals("CD")) {
                    intent = new Intent(getApplicationContext(), Book4Activity.class);
                    startActivity(intent);
                } else if (selectedText.equals("책")) {
                    intent = new Intent(getApplicationContext(), Book5Activity.class);
                    startActivity(intent);
                } else if (selectedText.equals("노트")) {
                    intent = new Intent(getApplicationContext(), Book5Activity.class);
                    startActivity(intent);
                } else if (selectedText.equals("볼펜")) {
                    intent = new Intent(getApplicationContext(), Book6Activity.class);
                    startActivity(intent);
                } else if (selectedText.equals("커터칼")) {
                    intent = new Intent(getApplicationContext(), Book7Activity.class);
                    startActivity(intent);
                } else if (selectedText.equals("의류")) {
                    intent = new Intent(getApplicationContext(), Clothes2Activity.class);
                    startActivity(intent);
                } else if (selectedText.equals("양말")) {
                    intent = new Intent(getApplicationContext(), Clothes3Activity.class);
                    startActivity(intent);
                } else if (selectedText.equals("모자")) {
                    intent = new Intent(getApplicationContext(), Clothes4Activity.class);
                    startActivity(intent);
                } else if (selectedText.equals("신발")) {
                    intent = new Intent(getApplicationContext(), Clothes5Activity.class);
                } else if (selectedText.equals("가방")) {
                    intent = new Intent(getApplicationContext(), Clothes6Activity.class);
                    startActivity(intent);
                } else if (selectedText.equals("옷걸이")) {
                    intent = new Intent(getApplicationContext(), Clothes7Activity.class);
                    startActivity(intent);
                } else if (selectedText.equals("배달 플라스틱")) {
                    intent = new Intent(getApplicationContext(), Container2Activity.class);
                    startActivity(intent);
                } else if (selectedText.equals("가스용기")) {
                    intent = new Intent(getApplicationContext(), Container3Activity.class);
                    startActivity(intent);
                } else if (selectedText.equals("술")) {
                    intent = new Intent(getApplicationContext(), Container4Activity.class);
                    startActivity(intent);
                } else if (selectedText.equals("음료병")) {
                    intent = new Intent(getApplicationContext(), Container4Activity.class);
                    startActivity(intent);
                } else if (selectedText.equals("우유팩")) {
                    intent = new Intent(getApplicationContext(), Container5Activity.class);
                } else if (selectedText.equals("요거트 용기")) {
                    intent = new Intent(getApplicationContext(), Container6Activity.class);
                    startActivity(intent);
                } else if (selectedText.equals("박스")) {
                    intent = new Intent(getApplicationContext(), Container7Activity.class);
                    startActivity(intent);
                } else if (selectedText.equals("프라이팬")) {
                    intent = new Intent(getApplicationContext(), Cream2Activity.class);
                    startActivity(intent);
                } else if (selectedText.equals("가위")) {
                    intent = new Intent(getApplicationContext(), Cream3Activity.class);
                    startActivity(intent);
                } else if (selectedText.equals("식칼")) {
                    intent = new Intent(getApplicationContext(), Cream4Activity.class);
                    startActivity(intent);
                } else if (selectedText.equals("고무장갑")) {
                    intent = new Intent(getApplicationContext(), Cream5Activity.class);
                    startActivity(intent);
                } else if (selectedText.equals("냄비")) {
                    intent = new Intent(getApplicationContext(), Cream6Activity.class);
                } else if (selectedText.equals("조리 기구")) {
                    intent = new Intent(getApplicationContext(), Cream7Activity.class);
                    startActivity(intent);
                } else if (selectedText.equals("가전제품")) {
                    intent = new Intent(getApplicationContext(), Elec2Activity.class);
                    startActivity(intent);
                } else if (selectedText.equals("TV")) {
                    intent = new Intent(getApplicationContext(), Elec3Activity.class);
                    startActivity(intent);
                } else if (selectedText.equals("세탁기")) {
                    intent = new Intent(getApplicationContext(), Elec4Activity.class);
                    startActivity(intent);
                } else if (selectedText.equals("노트북")) {
                    intent = new Intent(getApplicationContext(), Elec5Activity.class);
                    startActivity(intent);
                } else if (selectedText.equals("스피커")) {
                    intent = new Intent(getApplicationContext(), Elec6Activity.class);
                    startActivity(intent);
                } else if (selectedText.equals("프린터")) {
                    intent = new Intent(getApplicationContext(), Elec7Activity.class);
                } else if (selectedText.equals("침대")) {
                    intent = new Intent(getApplicationContext(), Gagu2Activity.class);
                    startActivity(intent);
                } else if (selectedText.equals("이불")) {
                    intent = new Intent(getApplicationContext(), Gagu3Activity.class);
                    startActivity(intent);
                } else if (selectedText.equals("전구")) {
                    intent = new Intent(getApplicationContext(), Gagu4Activity.class);
                    startActivity(intent);
                } else if (selectedText.equals("의자")) {
                    intent = new Intent(getApplicationContext(), Gagu5Activity.class);
                    startActivity(intent);
                } else if (selectedText.equals("베개")) {
                    intent = new Intent(getApplicationContext(), Gagu6Activity.class);
                    startActivity(intent);
                } else if (selectedText.equals("소파")) {
                    intent = new Intent(getApplicationContext(), Gagu7Activity.class);


                }
            }
        });
    }



    // 검색을 수행하는 메소드
    public void search(String charText) {

        // 문자 입력시마다 리스트를 지우고 새로 뿌려준다.
        list.clear();

        // 문자 입력이 없을때는 모든 데이터를 보여준다.
        if (charText.length() == 0) {
            list.addAll(arraylist);
        }
        // 문자 입력을 할때..
        else
        {
            // 리스트의 모든 데이터를 검색한다.
            for(int i = 0;i < arraylist.size(); i++)
            {
                // arraylist의 모든 데이터에 입력받은 단어(charText)가 포함되어 있으면 true를 반환한다.
                if (arraylist.get(i).toLowerCase().contains(charText))
                {
                    // 검색된 데이터를 리스트에 추가한다.
                    list.add(arraylist.get(i));
                }
            }
        }
        // 리스트 데이터가 변경되었으므로 아답터를 갱신하여 검색된 데이터를 화면에 보여준다.
        adapter.notifyDataSetChanged();
    }

    // 검색에 사용될 데이터를 리스트에 추가한다.
    private void settingList(){
        list.add("일반 종이");
        list.add("자석");
        list.add("CD");
        list.add("책");
        list.add("노트");
        list.add("볼펜");
        list.add("커터칼");
        list.add("의류");
        list.add("양말");
        list.add("모자");
        list.add("신발");
        list.add("가방");
        list.add("옷걸이");
        list.add("배달 플라스틱");
        list.add("가스용기");
        list.add("술");
        list.add("음료병");
        list.add("우유팩");
        list.add("요거트 용기");
        list.add("박스");
        list.add("프라이팬");
        list.add("가위");
        list.add("식칼");
        list.add("고무장갑");
        list.add("냄비");
        list.add("조리 기구");
        list.add("가전제품");
        list.add("tv");
        list.add("세탁기");
        list.add("노트북");
        list.add("스피커");
        list.add("프린터");
        list.add("침대");
        list.add("이불");
        list.add("전구");
        list.add("의자");
        list.add("베개");
        list.add("소파");
    }
}