package androidx.leanback.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.SoundPool;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SearchBar extends RelativeLayout {
    public SearchEditText a;
    public SpeechOrbView b;
    public String c;
    public final Handler d;
    public boolean e;
    SoundPool f;
    SparseIntArray g;
    private String h;
    private final InputMethodManager i;
    private Drawable j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private int o;
    private int p;
    private final Context q;

    static {
        SearchBar.class.getSimpleName();
    }

    public SearchBar(Context context) {
        this(context, (AttributeSet) null);
    }

    private final void c() {
        String string = getResources().getString(R.string.lb_search_bar_hint);
        if (!TextUtils.isEmpty((CharSequence) null)) {
            if (d()) {
                string = getResources().getString(R.string.lb_search_bar_hint_with_title_speech, new Object[]{null});
            } else {
                string = getResources().getString(R.string.lb_search_bar_hint_with_title, new Object[]{null});
            }
        } else if (d()) {
            string = getResources().getString(R.string.lb_search_bar_hint_speech);
        }
        this.h = string;
        SearchEditText searchEditText = this.a;
        if (searchEditText != null) {
            searchEditText.setHint(string);
        }
    }

    private final boolean d() {
        return this.b.isFocused();
    }

    public final void a() {
        this.i.hideSoftInputFromWindow(this.a.getWindowToken(), 0);
    }

    public final void b() {
        if (!hasFocus()) {
            requestFocus();
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f = new SoundPool(2, 1, 0);
        Context context = this.q;
        int[] iArr = {R.raw.lb_voice_failure, R.raw.lb_voice_open, R.raw.lb_voice_no_input, R.raw.lb_voice_success};
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = iArr[i2];
            this.g.put(i3, this.f.load(context, i3, 1));
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        this.f.release();
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.j = ((RelativeLayout) findViewById(R.id.lb_search_bar_items)).getBackground();
        this.a = (SearchEditText) findViewById(R.id.lb_search_text_editor);
        ImageView imageView = (ImageView) findViewById(R.id.lb_search_bar_badge);
        this.a.setOnFocusChangeListener(new akp(this));
        this.a.addTextChangedListener(new akr(this, new akq(this)));
        this.a.a = new aks();
        this.a.setOnEditorActionListener(new aku(this));
        this.a.setPrivateImeOptions("escapeNorth,voiceDismiss");
        SpeechOrbView speechOrbView = (SpeechOrbView) findViewById(R.id.lb_search_bar_speech_orb);
        this.b = speechOrbView;
        speechOrbView.a = new akv(this);
        this.b.setOnFocusChangeListener(new akw(this));
        a(hasFocus());
        c();
    }

    public final void setNextFocusDownId(int i2) {
        this.b.setNextFocusDownId(i2);
        this.a.setNextFocusDownId(i2);
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(boolean z) {
        if (!z) {
            this.j.setAlpha(this.o);
            this.a.setTextColor(this.k);
            this.a.setHintTextColor(this.m);
        } else {
            this.j.setAlpha(this.p);
            if (d()) {
                this.a.setTextColor(this.n);
                this.a.setHintTextColor(this.n);
            } else {
                this.a.setTextColor(this.l);
                this.a.setHintTextColor(this.n);
            }
        }
        c();
    }

    public SearchBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.d = new Handler();
        this.e = false;
        this.g = new SparseIntArray();
        this.q = context;
        Resources resources = getResources();
        LayoutInflater.from(getContext()).inflate(R.layout.lb_search_bar, this, true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.lb_search_bar_height));
        layoutParams.addRule(10, -1);
        setLayoutParams(layoutParams);
        setBackgroundColor(0);
        setClipChildren(false);
        this.c = "";
        this.i = (InputMethodManager) context.getSystemService("input_method");
        this.l = resources.getColor(R.color.lb_search_bar_text_speech_mode);
        this.k = resources.getColor(R.color.lb_search_bar_text);
        this.p = resources.getInteger(R.integer.lb_search_bar_speech_mode_background_alpha);
        this.o = resources.getInteger(R.integer.lb_search_bar_text_mode_background_alpha);
        this.n = resources.getColor(R.color.lb_search_bar_hint_speech_mode);
        this.m = resources.getColor(R.color.lb_search_bar_hint);
    }
}
