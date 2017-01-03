package group.g203.countables.path.main.view;

import android.os.Bundle;

import group.g203.countables.base.view.BaseActivity;
import group.g203.countables.path.main.presenter.MainPresenter;

public class MainActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setPresenter(new MainPresenter());
        handleContentDisplay();
    }
}
