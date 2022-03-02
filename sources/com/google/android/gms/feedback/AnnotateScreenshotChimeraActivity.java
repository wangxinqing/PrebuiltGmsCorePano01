package com.google.android.gms.feedback;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.feedback.Screenshot;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AnnotateScreenshotChimeraActivity extends Activity {
    public DrawableView a;
    boolean b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;
    private View j;
    private FrameLayout k;
    private int l;
    private int m;
    private int n;

    private final void a(ImageView imageView) {
        ofx.a(imageView, (Context) this, ofy.a(this, R.attr.ghf_greyIconColor));
    }

    public final void b() {
        if (ofy.b() && ofy.b(this, R.attr.gf_isInDarkMode)) {
            findViewById(R.id.gf_select_blackout_view).setBackground(kf.a((Context) this, (int) R.drawable.gf_circle_drawable_blackout_with_stroke));
        }
        this.a.a((int) axgy.g(), (int) axgy.f());
        View view = this.d;
        int i2 = this.n;
        view.setPadding(i2, i2, i2, i2);
        this.c.setPadding(0, 0, 0, 0);
    }

    public final void c() {
        ((LinearLayout) this.e).removeAllViews();
    }

    public final void d() {
        FeedbackChimeraActivity.a(this.a.e);
        finish();
    }

    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            return super.onKeyDown(i2, keyEvent);
        }
        d();
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.setLocation(motionEvent.getX() - ((float) this.m), motionEvent.getY() - ((float) this.l));
        this.a.onTouchEvent(motionEvent);
        return true;
    }

    public final void onWindowFocusChanged(boolean z) {
        int i2;
        int i3;
        if (!this.b) {
            if (ofq.a(axng.b())) {
                DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
                if (!FeedbackChimeraActivity.l() ? displayMetrics.widthPixels <= displayMetrics.heightPixels : displayMetrics.heightPixels <= displayMetrics.widthPixels) {
                    if (!FeedbackChimeraActivity.m() || !FeedbackChimeraActivity.l) {
                        Screenshot screenshot = FeedbackChimeraActivity.d.b;
                        ErrorReport g2 = FeedbackChimeraActivity.d.g();
                        if (g2.v == null) {
                            i3 = screenshot.a;
                            i2 = screenshot.b;
                        } else {
                            int i4 = g2.x;
                            int i5 = g2.w;
                            i3 = i4;
                            i2 = i5;
                        }
                        Rect rect = new Rect();
                        getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                        Pair a2 = mwj.a(getResources(), rect, i3, i2, false);
                        new muk(this, ((Integer) a2.first).intValue(), ((Integer) a2.second).intValue()).executeOnExecutor(jfm.a(9), new Void[0]);
                        return;
                    }
                }
            }
            a(FeedbackChimeraActivity.e);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!FeedbackChimeraActivity.m()) {
            finish();
            return;
        }
        boolean a2 = ofy.a();
        int i2 = R.style.gf_DarkActivityStyle;
        if (a2) {
            mwg mwg = FeedbackChimeraActivity.d;
            if (mwg != null) {
                ErrorReport g2 = mwg.g();
                if (g2 == null) {
                    setTheme(R.style.gf_DayNightActivityStyle);
                } else {
                    ofy.a((Activity) this, g2, (int) R.style.gf_LightActivityStyle, (int) R.style.gf_DarkActivityStyle, (int) R.style.gf_DayNightActivityStyle);
                }
            } else {
                setTheme(R.style.gf_DayNightActivityStyle);
            }
        } else if (ofy.b()) {
            mwg mwg2 = FeedbackChimeraActivity.d;
            if (mwg2 == null) {
                i2 = R.style.gf_LightActivityStyle;
            } else if (!ofy.a(mwg2.g())) {
                i2 = R.style.gf_LightActivityStyle;
            }
            setTheme(i2);
        } else {
            setTheme(R.style.gf_ActivityStyleDark);
        }
        setContentView((int) R.layout.annotate_screenshot_ui);
        this.a = (DrawableView) findViewById(R.id.gf_drawable_view);
        this.c = findViewById(R.id.gf_blackout_layout);
        this.d = findViewById(R.id.gf_highlight_layout);
        this.e = findViewById(R.id.gf_info_text_layout);
        this.f = findViewById(R.id.gf_menu_layout);
        this.g = findViewById(R.id.gf_close_view);
        this.h = findViewById(R.id.gf_undo_view);
        this.i = findViewById(R.id.gf_done_view);
        this.j = findViewById(R.id.gf_got_it_text_view);
        this.k = (FrameLayout) findViewById(R.id.gf_contain_drawable);
        this.n = (int) getResources().getDimension(R.dimen.gf_selected_border_padding);
        if (ofy.b()) {
            a((ImageView) this.g);
            a((ImageView) this.h);
            a((ImageView) this.i);
        }
        this.c.setOnClickListener(new mud(this));
        this.g.setOnClickListener(new mue(this));
        this.d.setOnClickListener(new muf(this));
        this.h.setOnClickListener(new mug(this));
        this.i.setOnClickListener(new muh(this));
        this.j.setOnClickListener(new mui(this));
        new qvr(Looper.getMainLooper()).postDelayed(new muj(this), axgy.a.a().o());
        if (FeedbackChimeraActivity.l()) {
            setRequestedOrientation(1);
        } else {
            setRequestedOrientation(0);
        }
        Intent intent = getIntent();
        if (!ofy.b() && intent != null && intent.hasExtra("EXTRA_ACTION_BAR_COLOR_RES_ID")) {
            int intExtra = intent.getIntExtra("EXTRA_ACTION_BAR_COLOR_RES_ID", -1);
            int i3 = Build.VERSION.SDK_INT;
            if (intExtra != 0) {
                getWindow().setStatusBarColor(lk.a(intExtra, kf.b(this, R.color.material_grey_black_1000), 0.2f));
            }
            String string = getString(R.string.gf_report_feedback);
            int i4 = Build.VERSION.SDK_INT;
            if (intExtra == 0) {
                intExtra = ThemeSettings.a(this);
            }
            setTaskDescription(new ActivityManager.TaskDescription(string, (Bitmap) null, intExtra));
        }
    }

    public final void a() {
        if (ofy.b() && ofy.b(this, R.attr.gf_isInDarkMode)) {
            findViewById(R.id.gf_select_blackout_view).setBackground(kf.a((Context) this, (int) R.drawable.gf_circle_drawable_blackout_without_stroke));
        }
        this.a.a((int) axgy.a.a().f(), (int) axgy.c());
        View view = this.c;
        int i2 = this.n;
        view.setPadding(i2, i2, i2, i2);
        this.d.setPadding(0, 0, 0, 0);
    }

    public final void a(Bitmap bitmap) {
        int width = bitmap.getWidth();
        this.a.getLayoutParams().width = width;
        Rect rect = new Rect();
        getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        this.l = rect.top + this.f.getHeight() + ((ViewGroup.MarginLayoutParams) this.k.getLayoutParams()).topMargin;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.m = (displayMetrics.widthPixels - width) / 2;
        this.k.getLayoutParams().width = width;
        this.k.setLeft(this.m);
        this.k.setRight(displayMetrics.widthPixels - this.m);
        DrawableView drawableView = this.a;
        drawableView.b = bitmap;
        drawableView.e = bitmap.copy(bitmap.getConfig(), true);
        drawableView.c = new Canvas(drawableView.b);
        drawableView.c.drawBitmap(drawableView.b, 0.0f, 0.0f, drawableView.a);
        this.b = true;
    }
}
