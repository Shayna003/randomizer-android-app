package com.github.shayna003.randomizer;

import android.opengl.Visibility;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.github.shayna003.randomizer.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Random;

public class MainActivity extends AppCompatActivity
{
  private ImageView one;
  private ImageView two;
  private ImageView three;
  private ImageView four;
  private ImageView five;
  private  ImageView six;
  private ImageView size;
  private ImageView heads;
  private ImageView tails;
  private Button coin_flip;
  private Button roll_dice;
  private Random random;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.content_main);

    one = findViewById(R.id.one);
    two = findViewById(R.id.two);
    three = findViewById(R.id.three);
    four = findViewById(R.id.four);
    five = findViewById(R.id.five);
    six = findViewById(R.id.six);
    heads = findViewById(R.id.heads);
    tails = findViewById(R.id.tails);
    roll_dice = findViewById(R.id.roll_dice);
    coin_flip = findViewById(R.id.coin_flip);
    random = new Random();

    //Define and attach click listener
    coin_flip.setOnClickListener(new View.OnClickListener()
    {
      @Override
      public void onClick(View v)
      {
        hide_coins();
        int rand = random.nextInt(2);
        if (rand == 0)
        {
          tails.setVisibility(View.VISIBLE);
        }
        else
        {
          heads.setVisibility(View.VISIBLE);
        }
      }
    });

    roll_dice.setOnClickListener(new View.OnClickListener()
    {
      @Override
      public void onClick(View v)
      {
        hide_dice();
        int rand = random.nextInt(7);
        if (rand == 0)
        {
          one.setVisibility(View.VISIBLE);
        }
        else if (rand == 1)
        {
          two.setVisibility(View.VISIBLE);
        }
        else if (rand == 2)
        {
          three.setVisibility(View.VISIBLE);
        }
        else if (rand == 3)
        {
          four.setVisibility(View.VISIBLE);
        }
        else if (rand == 4)
        {
          five.setVisibility(View.VISIBLE);
        }
        else
        {
          six.setVisibility(View.VISIBLE);
        }
      }
    });
  }

  void hide_dice()
  {
    one.setVisibility(View.INVISIBLE);
    two.setVisibility(View.INVISIBLE);
    three.setVisibility(View.INVISIBLE);
    four.setVisibility(View.INVISIBLE);
    five.setVisibility(View.INVISIBLE);
    six.setVisibility(View.INVISIBLE);
  }

  void hide_coins()
  {
    heads.setVisibility(View.INVISIBLE);
    tails.setVisibility(View.INVISIBLE);
  }
}