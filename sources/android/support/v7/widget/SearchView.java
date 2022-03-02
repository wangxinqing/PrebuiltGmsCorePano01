package android.support.v7.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.AbsSavedState;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SearchView extends abf implements vs {
    static final aeg u = (Build.VERSION.SDK_INT < 29 ? new aeg() : null);
    private aej A;
    private Rect B;
    private Rect C;
    private int[] D;
    private int[] E;
    private final ImageView F;
    private final Drawable G;
    private final Intent H;
    private final Intent I;
    private final CharSequence J;
    private CharSequence K;
    private boolean L;
    private int M;
    private boolean N;
    private boolean O;
    private int P;
    private final Runnable Q;
    private Runnable R;
    private final WeakHashMap S;
    private final View.OnClickListener T;
    private final TextView.OnEditorActionListener U;
    private final AdapterView.OnItemClickListener V;
    private final AdapterView.OnItemSelectedListener W;
    public final SearchAutoComplete a;
    private TextWatcher aa;
    public final View b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;
    public final ImageView i;
    public final View j;
    public final int k;
    public final int l;
    public aef m;
    public View.OnFocusChangeListener n;
    public boolean o;
    public boolean p;
    public ahu q;
    public CharSequence r;
    public CharSequence s;
    public SearchableInfo t;
    View.OnKeyListener v;
    public vis w;
    public ong x;
    private final View y;
    private final View z;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new aeh();
        boolean c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }

        public final String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.c + "}";
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.c));
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class SearchAutoComplete extends yo {
        public SearchView a;
        public boolean b;
        final Runnable c;
        private int d;

        public SearchAutoComplete(Context context) {
            this(context, (AttributeSet) null);
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            aeg aeg = SearchView.u;
            aeg.a();
            Method method = aeg.c;
            if (method != null) {
                try {
                    method.invoke(this, new Object[]{true});
                } catch (Exception e) {
                }
            }
        }

        public final boolean enoughToFilter() {
            return this.d <= 0 || super.enoughToFilter();
        }

        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.b) {
                removeCallbacks(this.c);
                post(this.c);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public final void onFinishInflate() {
            int i;
            super.onFinishInflate();
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                i = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            } else if (i2 < 600) {
                i = 160;
            } else {
                i = 192;
            }
            setMinWidth((int) TypedValue.applyDimension(1, (float) i, displayMetrics));
        }

        /* access modifiers changed from: protected */
        public final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.a;
            searchView.b(searchView.p);
            searchView.h();
            if (searchView.a.hasFocus()) {
                searchView.n();
            }
        }

        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.a.clearFocus();
                        a(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public final void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.a.hasFocus() && getVisibility() == 0) {
                this.b = true;
                if (SearchView.a(getContext())) {
                    a();
                }
            }
        }

        public final void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public final void replaceText(CharSequence charSequence) {
        }

        public final void setThreshold(int i) {
            super.setThreshold(i);
            this.d = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.c = new aei(this);
            this.d = getThreshold();
        }

        /* access modifiers changed from: package-private */
        public final void a(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.b = false;
                removeCallbacks(this.c);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.b = false;
                removeCallbacks(this.c);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.b = true;
            }
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    private final Intent a(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.s);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        intent.setComponent(this.t.getSearchActivity());
        return intent;
    }

    private final int p() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private final int q() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private final void r() {
        SpannableStringBuilder spannableStringBuilder = this.K;
        if (spannableStringBuilder == null) {
            SearchableInfo searchableInfo = this.t;
            if (searchableInfo == null || searchableInfo.getHintId() == 0) {
                spannableStringBuilder = this.J;
            } else {
                spannableStringBuilder = getContext().getText(this.t.getHintId());
            }
        }
        SearchAutoComplete searchAutoComplete = this.a;
        if (spannableStringBuilder == null) {
            spannableStringBuilder = "";
        }
        if (this.o && this.G != null) {
            double textSize = (double) searchAutoComplete.getTextSize();
            Double.isNaN(textSize);
            int i2 = (int) (textSize * 1.25d);
            this.G.setBounds(0, 0, i2, i2);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("   ");
            spannableStringBuilder2.setSpan(new ImageSpan(this.G), 1, 2, 33);
            spannableStringBuilder2.append(spannableStringBuilder);
            spannableStringBuilder = spannableStringBuilder2;
        }
        searchAutoComplete.setHint(spannableStringBuilder);
    }

    private final void s() {
        this.a.dismissDropDown();
    }

    public final void b() {
        a("", false);
        clearFocus();
        b(true);
        this.a.setImeOptions(this.P);
        this.O = false;
    }

    public final void c(boolean z2) {
        int i2 = 8;
        if (this.N && !this.p && z2) {
            this.d.setVisibility(8);
            i2 = 0;
        }
        this.i.setVisibility(i2);
    }

    public final void clearFocus() {
        this.L = true;
        super.clearFocus();
        this.a.clearFocus();
        this.a.a(false);
        this.L = false;
    }

    public final CharSequence d() {
        return this.a.getText();
    }

    public final boolean e(int i2) {
        Intent intent;
        int i3;
        Uri uri;
        String a2;
        Cursor cursor;
        int i4 = i2;
        ong ong = this.x;
        if (!(ong == null || (cursor = ong.a().a.q.d) == null)) {
            ArrayList arrayList = new ArrayList();
            try {
                int columnIndex = cursor.getColumnIndex("suggest_format");
                int columnIndex2 = cursor.getColumnIndex("suggest_intent_query");
                int columnIndex3 = cursor.getColumnIndex("suggest_text_1");
                int columnIndex4 = cursor.getColumnIndex("suggest_text_2_url");
                int columnIndex5 = cursor.getColumnIndex("help_action_string");
                omv omv = null;
                int i5 = 0;
                while (i5 < cursor.getCount()) {
                    cursor.moveToPosition(i5);
                    int i6 = cursor.getInt(columnIndex);
                    String string = cursor.getString(columnIndex2);
                    String string2 = cursor.getString(columnIndex3);
                    int i7 = columnIndex;
                    String string3 = cursor.getString(columnIndex4);
                    int i8 = columnIndex2;
                    String string4 = cursor.getString(columnIndex5);
                    Cursor cursor2 = cursor;
                    omv omv2 = new omv(i6, string2, string, string3, string4);
                    arrayList.add(omv2);
                    if (i5 == i4) {
                        if (i6 == 1) {
                            ooe.a(ong.a, oab.a(string3, oal.a(), ong.a.x), 32, i4);
                        } else if (i6 == 2) {
                            oab b2 = oab.b(string4, string3);
                            if (b2.o()) {
                                oad.a(b2, ong.a);
                            } else if (b2.n()) {
                                oad.a(new oho(), b2, ong.a);
                            } else if (b2.m()) {
                                oad.a(new oah(ong.a), b2, i4, 32, b2.d);
                            }
                        } else {
                            ong.a().a(string, true);
                        }
                        omv = omv2;
                    }
                    i5++;
                    columnIndex = i7;
                    columnIndex2 = i8;
                    cursor = cursor2;
                }
                okg.a((nzu) ong.a, (List) arrayList, omv);
                return false;
            } catch (Exception e2) {
            }
        }
        Cursor cursor3 = this.q.d;
        if (cursor3 != null && cursor3.moveToPosition(i4)) {
            try {
                String a3 = aeo.a(cursor3, "suggest_intent_action");
                if (a3 == null) {
                    a3 = this.t.getSuggestIntentAction();
                }
                if (a3 == null) {
                    a3 = "android.intent.action.SEARCH";
                }
                String a4 = aeo.a(cursor3, "suggest_intent_data");
                if (a4 == null) {
                    a4 = this.t.getSuggestIntentData();
                }
                if (!(a4 == null || (a2 = aeo.a(cursor3, "suggest_intent_data_id")) == null)) {
                    a4 = a4 + "/" + Uri.encode(a2);
                }
                if (a4 != null) {
                    uri = Uri.parse(a4);
                } else {
                    uri = null;
                }
                intent = a(a3, uri, aeo.a(cursor3, "suggest_intent_extra_data"), aeo.a(cursor3, "suggest_intent_query"));
            } catch (RuntimeException e3) {
                RuntimeException runtimeException = e3;
                try {
                    i3 = cursor3.getPosition();
                } catch (RuntimeException e4) {
                    i3 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i3 + " returned exception.", runtimeException);
                intent = null;
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e5) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e5);
                }
            }
        }
        this.a.a(false);
        s();
        return true;
    }

    public final void f() {
        int i2 = 0;
        if (!this.N || this.p || !(this.d.getVisibility() == 0 || this.i.getVisibility() == 0)) {
            i2 = 8;
        }
        this.z.setVisibility(i2);
    }

    public final void g() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.a.getText());
        int i2 = 0;
        if (!z3) {
            if (!this.o) {
                z2 = false;
            } else if (this.O) {
                z2 = false;
            }
        }
        ImageView imageView = this.e;
        if (!z2) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        Drawable drawable = this.e.getDrawable();
        if (drawable != null) {
            drawable.setState(!z3 ? EMPTY_STATE_SET : ENABLED_STATE_SET);
        }
    }

    public final void h() {
        post(this.Q);
    }

    public final void i() {
        int[] iArr = !this.a.hasFocus() ? EMPTY_STATE_SET : FOCUSED_STATE_SET;
        Drawable background = this.b.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.z.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void j() {
        Editable text = this.a.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            aef aef = this.m;
            if (aef == null || !aef.a(text.toString())) {
                if (this.t != null) {
                    a(text.toString());
                }
                this.a.a(false);
                s();
            }
        }
    }

    public final void k() {
        if (!TextUtils.isEmpty(this.a.getText())) {
            this.a.setText("");
            this.a.requestFocus();
            this.a.a(true);
        } else if (this.o) {
            vis vis = this.w;
            if (vis != null) {
                vis.a.a((String) null, false);
            }
            clearFocus();
            b(true);
        }
    }

    public final void l() {
        b(false);
        this.a.requestFocus();
        this.a.a(true);
    }

    public final void m() {
        String str;
        String str2;
        int i2;
        SearchableInfo searchableInfo = this.t;
        if (searchableInfo != null) {
            try {
                String str3 = null;
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    Intent intent = new Intent(this.H);
                    ComponentName searchActivity = searchableInfo.getSearchActivity();
                    if (searchActivity != null) {
                        str3 = searchActivity.flattenToShortString();
                    }
                    intent.putExtra("calling_package", str3);
                    getContext().startActivity(intent);
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    Intent intent2 = this.I;
                    ComponentName searchActivity2 = searchableInfo.getSearchActivity();
                    Intent intent3 = new Intent("android.intent.action.SEARCH");
                    intent3.setComponent(searchActivity2);
                    PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent3, JGCastService.FLAG_PRIVATE_DISPLAY);
                    Bundle bundle = new Bundle();
                    Intent intent4 = new Intent(intent2);
                    String str4 = "free_form";
                    Resources resources = getResources();
                    if (searchableInfo.getVoiceLanguageModeId() != 0) {
                        str4 = resources.getString(searchableInfo.getVoiceLanguageModeId());
                    }
                    if (searchableInfo.getVoicePromptTextId() != 0) {
                        str = resources.getString(searchableInfo.getVoicePromptTextId());
                    } else {
                        str = null;
                    }
                    if (searchableInfo.getVoiceLanguageId() != 0) {
                        str2 = resources.getString(searchableInfo.getVoiceLanguageId());
                    } else {
                        str2 = null;
                    }
                    if (searchableInfo.getVoiceMaxResults() != 0) {
                        i2 = searchableInfo.getVoiceMaxResults();
                    } else {
                        i2 = 1;
                    }
                    intent4.putExtra("android.speech.extra.LANGUAGE_MODEL", str4);
                    intent4.putExtra("android.speech.extra.PROMPT", str);
                    intent4.putExtra("android.speech.extra.LANGUAGE", str2);
                    intent4.putExtra("android.speech.extra.MAX_RESULTS", i2);
                    if (searchActivity2 != null) {
                        str3 = searchActivity2.flattenToShortString();
                    }
                    intent4.putExtra("calling_package", str3);
                    intent4.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
                    intent4.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
                    getContext().startActivity(intent4);
                }
            } catch (ActivityNotFoundException e2) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    public final void n() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.a.refreshAutoCompleteResults();
            return;
        }
        aeg aeg = u;
        SearchAutoComplete searchAutoComplete = this.a;
        aeg.a();
        Method method = aeg.a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception e2) {
            }
        }
        aeg aeg2 = u;
        SearchAutoComplete searchAutoComplete2 = this.a;
        aeg.a();
        Method method2 = aeg2.b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception e3) {
            }
        }
    }

    public final void o() {
        this.d.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        removeCallbacks(this.Q);
        post(this.R);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            SearchAutoComplete searchAutoComplete = this.a;
            Rect rect = this.B;
            searchAutoComplete.getLocationInWindow(this.D);
            getLocationInWindow(this.E);
            int[] iArr = this.D;
            int i6 = iArr[1];
            int[] iArr2 = this.E;
            int i7 = i6 - iArr2[1];
            int i8 = iArr[0] - iArr2[0];
            rect.set(i8, i7, searchAutoComplete.getWidth() + i8, searchAutoComplete.getHeight() + i7);
            this.C.set(this.B.left, 0, this.B.right, i5 - i3);
            aej aej = this.A;
            if (aej == null) {
                aej aej2 = new aej(this.C, this.B, this.a);
                this.A = aej2;
                setTouchDelegate(aej2);
                return;
            }
            aej.a(this.C, this.B);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int i4;
        if (!this.p) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode == Integer.MIN_VALUE) {
                int i5 = this.M;
                size = i5 <= 0 ? Math.min(p(), size) : Math.min(i5, size);
            } else if (mode == 0) {
                size = this.M;
                if (size <= 0) {
                    size = p();
                }
            } else if (mode == 1073741824 && (i4 = this.M) > 0) {
                size = Math.min(i4, size);
            }
            int mode2 = View.MeasureSpec.getMode(i3);
            int size2 = View.MeasureSpec.getSize(i3);
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(q(), size2);
            } else if (mode2 == 0) {
                size2 = q();
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(size2, JGCastService.FLAG_PRIVATE_DISPLAY));
            return;
        }
        super.onMeasure(i2, i3);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.b);
        b(savedState.c);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c = this.p;
        return savedState;
    }

    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        h();
    }

    public final boolean requestFocus(int i2, Rect rect) {
        if (this.L || !isFocusable()) {
            return false;
        }
        if (this.p) {
            return super.requestFocus(i2, rect);
        }
        boolean requestFocus = this.a.requestFocus(i2, rect);
        if (requestFocus) {
            b(false);
        }
        return requestFocus;
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public final void b(int i2) {
        this.M = i2;
        requestLayout();
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.B = new Rect();
        this.C = new Rect();
        this.D = new int[2];
        this.E = new int[2];
        this.Q = new adw(this);
        this.R = new adx(this);
        this.S = new WeakHashMap();
        this.T = new aea(this);
        this.v = new aeb(this);
        this.U = new aec(this);
        this.V = new aed(this);
        this.W = new aee(this);
        this.aa = new adv(this);
        aev a2 = aev.a(context, attributeSet, uh.v, i2, 0);
        LayoutInflater.from(context).inflate(a2.f(9, R.layout.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.a = searchAutoComplete;
        searchAutoComplete.a = this;
        this.y = findViewById(R.id.search_edit_frame);
        this.b = findViewById(R.id.search_plate);
        this.z = findViewById(R.id.submit_area);
        this.c = (ImageView) findViewById(R.id.search_button);
        this.d = (ImageView) findViewById(R.id.search_go_btn);
        this.e = (ImageView) findViewById(R.id.search_close_btn);
        this.i = (ImageView) findViewById(R.id.search_voice_btn);
        this.F = (ImageView) findViewById(R.id.search_mag_icon);
        qb.a(this.b, a2.a(10));
        qb.a(this.z, a2.a(14));
        this.c.setImageDrawable(a2.a(13));
        this.d.setImageDrawable(a2.a(7));
        this.e.setImageDrawable(a2.a(4));
        this.i.setImageDrawable(a2.a(16));
        this.F.setImageDrawable(a2.a(13));
        this.G = a2.a(12);
        afg.a(this.c, getResources().getString(R.string.abc_searchview_description_search));
        this.k = a2.f(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.l = a2.f(5, 0);
        this.c.setOnClickListener(this.T);
        this.e.setOnClickListener(this.T);
        this.d.setOnClickListener(this.T);
        this.i.setOnClickListener(this.T);
        this.a.setOnClickListener(this.T);
        this.a.addTextChangedListener(this.aa);
        this.a.setOnEditorActionListener(this.U);
        this.a.setOnItemClickListener(this.V);
        this.a.setOnItemSelectedListener(this.W);
        this.a.setOnKeyListener(this.v);
        this.a.setOnFocusChangeListener(new ady(this));
        boolean a3 = a2.a(8, true);
        if (this.o != a3) {
            this.o = a3;
            b(a3);
            r();
        }
        int d2 = a2.d(1, -1);
        if (d2 != -1) {
            b(d2);
        }
        this.J = a2.c(6);
        this.K = a2.c(11);
        int a4 = a2.a(3, -1);
        if (a4 != -1) {
            a(a4);
        }
        int a5 = a2.a(2, -1);
        if (a5 != -1) {
            this.a.setInputType(a5);
        }
        setFocusable(a2.a(0, true));
        a2.a();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.H = intent;
        intent.addFlags(268435456);
        this.H.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.I = intent2;
        intent2.addFlags(268435456);
        View findViewById = findViewById(this.a.getDropDownAnchor());
        this.j = findViewById;
        if (findViewById != null) {
            findViewById.addOnLayoutChangeListener(new adz(this));
        }
        b(this.o);
        r();
    }

    public final void b(CharSequence charSequence) {
        this.a.setText(charSequence);
        this.a.setSelection(!TextUtils.isEmpty(charSequence) ? charSequence.length() : 0);
    }

    public final void b(boolean z2) {
        int i2;
        int i3;
        this.p = z2;
        int i4 = 0;
        if (!z2) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        boolean isEmpty = TextUtils.isEmpty(this.a.getText());
        this.c.setVisibility(i2);
        o();
        View view = this.y;
        if (!z2) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        view.setVisibility(i3);
        if (this.F.getDrawable() == null || this.o) {
            i4 = 8;
        }
        this.F.setVisibility(i4);
        g();
        c(isEmpty);
        f();
    }

    static boolean a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    public final void a() {
        if (!this.O) {
            this.O = true;
            int imeOptions = this.a.getImeOptions();
            this.P = imeOptions;
            this.a.setImeOptions(imeOptions | 33554432);
            this.a.setText("");
            a(false);
        }
    }

    public final void a(int i2) {
        this.a.setImeOptions(i2);
    }

    public final void a(SearchableInfo searchableInfo) {
        this.t = searchableInfo;
        Intent intent = null;
        boolean z2 = true;
        if (searchableInfo != null) {
            this.a.setThreshold(searchableInfo.getSuggestThreshold());
            this.a.setImeOptions(this.t.getImeOptions());
            int inputType = this.t.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.t.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            this.a.setInputType(inputType);
            ahu ahu = this.q;
            if (ahu != null) {
                ahu.a((Cursor) null);
            }
            if (this.t.getSuggestAuthority() != null) {
                aeo aeo = new aeo(getContext(), this, this.t, this.S);
                this.q = aeo;
                this.a.setAdapter(aeo);
                ((aeo) this.q).a = 1;
            }
            r();
        }
        SearchableInfo searchableInfo2 = this.t;
        if (searchableInfo2 == null || !searchableInfo2.getVoiceSearchEnabled()) {
            z2 = false;
        } else {
            if (this.t.getVoiceSearchLaunchWebSearch()) {
                intent = this.H;
            } else if (this.t.getVoiceSearchLaunchRecognizer()) {
                intent = this.I;
            }
            if (intent == null) {
                z2 = false;
            } else if (getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
                z2 = false;
            }
        }
        this.N = z2;
        if (z2) {
            this.a.setPrivateImeOptions("nm");
        }
        b(this.p);
    }

    public final void a(CharSequence charSequence) {
        this.K = charSequence;
        r();
    }

    public final void a(CharSequence charSequence, boolean z2) {
        this.a.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.a;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.s = charSequence;
        }
        if (z2 && !TextUtils.isEmpty(charSequence)) {
            j();
        }
    }

    public final void a(String str) {
        getContext().startActivity(a("android.intent.action.SEARCH", (Uri) null, (String) null, str));
    }

    public final void a(boolean z2) {
        if (!z2) {
            l();
        } else {
            k();
        }
    }
}
