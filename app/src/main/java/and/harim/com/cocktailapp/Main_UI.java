package and.harim.com.cocktailapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main_UI extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__ui);
    } //메인 실행시 메소드

    public void clcik_menu(View view) {
        Intent menu = new Intent(this,MenuActivity.class);
        startActivity(menu);
    }//상단 메뉴 클릭시

    public void click_map(View view) {
    }//상단 지도 클릭시

    public void click_search(View view) {
    }//상단 검색 클릭시

    public void click_bar(View view) {
        Intent bar = new Intent(this,BarActivity.class);
        startActivity(bar);
    } //맛집 메뉴 클릭시

    public void click_cocktail(View view) {
        Intent cocktail = new Intent(this,CocktailActivity.class);
        startActivity(cocktail);
    }//칵테일 메뉴 클릭시

    public void click_rank(View view) {
        Intent rank = new Intent(this,RankActivity.class);
        startActivity(rank);
    } //순위 메뉴 클릭시

    public void click_recipe(View view) {
    }//레시피 메뉴 클릭시





}
