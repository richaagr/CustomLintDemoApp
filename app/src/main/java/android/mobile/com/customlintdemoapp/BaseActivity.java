package android.mobile.com.customlintdemoapp;

import android.app.Activity;
import android.os.Bundle;

public class BaseActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    System.out.println("This is the base activity with additional feature");
  }
}
