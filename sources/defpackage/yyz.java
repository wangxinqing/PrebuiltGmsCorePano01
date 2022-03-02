package defpackage;

import android.content.pm.PackageManager;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.common.widget.phone.ScrollViewWithEvents;
import com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: yyz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class yyz extends Fragment implements View.OnClickListener, jmi, jmh {
    protected yxv a;
    protected LinearLayout b;
    public ScrollViewWithEvents c;
    protected Button d;
    protected Button e;
    public int f;
    private yyy g;
    private TextView h;
    private View i;
    private UpgradeAccountEntity j;
    private boolean k;
    private String l;
    private boolean m;

    private final List a(LinearLayout linearLayout) {
        ArrayList arrayList = new ArrayList();
        int childCount = linearLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = linearLayout.getChildAt(i2);
            if (childAt instanceof yxw) {
                arrayList.add((yxw) childAt);
            } else if (childAt instanceof LinearLayout) {
                arrayList.addAll(a((LinearLayout) childAt));
            }
        }
        return arrayList;
    }

    public final void a(int i2) {
        this.f = i2;
    }

    /* access modifiers changed from: protected */
    public void b() {
        if (!this.k) {
            this.e.setVisibility(0);
        }
    }

    public final void c() {
        if (this.b != null) {
            boolean z = true;
            if (!this.c.a()) {
                this.d.setEnabled(true);
            } else {
                Button button = this.d;
                List a2 = a(this.b);
                int size = a2.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    int i3 = i2 + 1;
                    if (!((yxw) a2.get(i2)).b()) {
                        z = false;
                        break;
                    }
                    i2 = i3;
                }
                button.setEnabled(z);
            }
            a();
        } else if (Log.isLoggable("UpgradeAccount", 5)) {
            Log.w("UpgradeAccount", "Next button update requested but form view has not yet been created");
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        UpgradeAccountEntity upgradeAccountEntity = this.j;
        if (upgradeAccountEntity != null) {
            a(upgradeAccountEntity);
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof yyy)) {
            String valueOf = String.valueOf(yyy.class.getSimpleName());
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Host must implement ") : "Host must implement ".concat(valueOf));
        }
        this.g = (yyy) activity;
        if (!(activity instanceof yxv)) {
            String valueOf2 = String.valueOf(yxv.class.getSimpleName());
            throw new IllegalStateException(valueOf2.length() == 0 ? new String("Host must implement ") : "Host must implement ".concat(valueOf2));
        } else {
            this.a = (yxv) activity;
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.next_button) {
            jjw.a(getActivity(), view);
            if (this.c.a()) {
                this.d.setEnabled(false);
                UpgradeAccountEntity upgradeAccountEntity = null;
                if (this.b != null) {
                    ArrayList arrayList = new ArrayList();
                    List a2 = a(this.b);
                    int size = a2.size();
                    zea zea = null;
                    zea zea2 = null;
                    for (int i2 = 0; i2 < size; i2++) {
                        yxw yxw = (yxw) a2.get(i2);
                        zea c2 = yxw.c();
                        if (c2 != null) {
                            if (yxw instanceof yyn) {
                                if (zea2 != null) {
                                    arrayList.add(zea2);
                                }
                                arrayList.add(c2);
                                if (zea != null) {
                                    arrayList.add(zea);
                                }
                                zea = null;
                                zea2 = null;
                            } else if (yxw instanceof yyb) {
                                zea2 = c2;
                            } else if (yxw instanceof yyd) {
                                zea = c2;
                            } else {
                                if (zea != null) {
                                    arrayList.add(zea);
                                    zea = null;
                                }
                                arrayList.add(c2);
                            }
                        }
                    }
                    if (zea != null) {
                        arrayList.add(zea);
                    }
                    zie zie = new zie();
                    zie.b = "upgrade";
                    zie.c.add(6);
                    zig zig = new zig();
                    zig.a = arrayList;
                    zig.b.add(2);
                    zie.a = new UpgradeAccountEntity.FormEntity(zig.b, zig.a);
                    zie.c.add(4);
                    upgradeAccountEntity = new UpgradeAccountEntity(zie.c, zie.a, zie.b);
                } else if (Log.isLoggable("UpgradeAccount", 5)) {
                    Log.w("UpgradeAccount", "FieldView values requested but form view has not yet been created");
                }
                if (yze.c(upgradeAccountEntity)) {
                    this.a.a(iaq.d, iar.c);
                }
                this.g.a(upgradeAccountEntity);
                return;
            }
            this.c.pageScroll(130);
            this.a.a(iaq.k);
        } else if (id == R.id.back_button) {
            this.a.a(iaq.q);
            this.g.f();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.j = (UpgradeAccountEntity) getArguments().getParcelable("upgrade_account");
            this.f = 0;
            return;
        }
        this.j = (UpgradeAccountEntity) bundle.getParcelable("state_upgrade_account");
        this.f = bundle.getInt("state_scroll_y");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.k = getArguments().getBoolean("is_setup_wizard_theme");
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.plus_oob_wide_ux_max_width);
        Activity activity = getActivity();
        int i2 = activity.getWindow().getAttributes().width;
        int i3 = activity.getWindow().getAttributes().height;
        if (dimensionPixelSize <= 0 || i2 != -2 || this.k) {
            this.m = false;
        } else {
            this.m = true;
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            Point point = new Point();
            int i4 = Build.VERSION.SDK_INT;
            defaultDisplay.getSize(point);
            activity.getWindow().setLayout(Math.min(dimensionPixelSize, point.x), i3);
        }
        View inflate = layoutInflater.inflate(R.layout.plus_oob_upgrade_account_form_fragment, viewGroup, false);
        this.b = (LinearLayout) inflate.findViewById(R.id.form_layout);
        ScrollViewWithEvents scrollViewWithEvents = (ScrollViewWithEvents) inflate.findViewById(R.id.scroll_view);
        this.c = scrollViewWithEvents;
        scrollViewWithEvents.a = this;
        scrollViewWithEvents.b = this;
        scrollViewWithEvents.getViewTreeObserver().addOnGlobalLayoutListener(new yyx(this));
        yzd.a(layoutInflater, inflate, this.k);
        this.h = (TextView) inflate.findViewById(R.id.title);
        if (!this.k) {
            String string = getArguments().getString("promo_app_package");
            if (!TextUtils.isEmpty(string)) {
                try {
                    ((ImageView) inflate.findViewById(R.id.title_icon)).setImageDrawable(getActivity().getPackageManager().getApplicationIcon(string));
                } catch (PackageManager.NameNotFoundException e2) {
                }
            }
        }
        View findViewById = inflate.findViewById(R.id.promo_layout);
        this.i = findViewById;
        if (this.k) {
            findViewById.setVisibility(8);
        } else {
            String string2 = getArguments().getString("promo_app_text");
            String string3 = getArguments().getString("com.google.android.gms.plus.intent.extra.CLIENT_CALLING_PACKAGE");
            TextView textView = (TextView) inflate.findViewById(R.id.promo_text_view);
            if (!TextUtils.isEmpty(string2)) {
                textView.setText(string2);
            } else if (!TextUtils.isEmpty(string3)) {
                String str = null;
                try {
                    PackageManager packageManager = getActivity().getPackageManager();
                    str = (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(string3, 0));
                } catch (PackageManager.NameNotFoundException e3) {
                    if (Log.isLoggable("UpgradeAccount", 5)) {
                        String valueOf = String.valueOf(string3);
                        Log.w("UpgradeAccount", valueOf.length() == 0 ? new String("getAppName can't find a package: ") : "getAppName can't find a package: ".concat(valueOf));
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    textView.setText(String.format(getResources().getString(R.string.plus_oob_3p_promo, new Object[]{str}), new Object[0]));
                }
            }
        }
        a(layoutInflater, inflate);
        Button button = (Button) inflate.findViewById(R.id.next_button);
        this.d = button;
        button.setOnClickListener(this);
        this.d.setEnabled(false);
        Button button2 = (Button) inflate.findViewById(R.id.back_button);
        this.e = button2;
        button2.setOnClickListener(this);
        String string4 = getArguments().getString("back_button_name");
        this.l = string4;
        if (TextUtils.isEmpty(string4)) {
            this.l = getResources().getString(17039360);
        }
        if (!this.k) {
            if (!TextUtils.isEmpty(this.l)) {
                this.e.setText(this.l);
                this.e.setVisibility(0);
            } else {
                this.e.setVisibility(8);
            }
        }
        return inflate;
    }

    public final void onDetach() {
        super.onDetach();
        this.g = null;
        this.a = null;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("state_upgrade_account", this.j);
        bundle.putInt("state_scroll_y", this.f);
    }

    private final List a(List list) {
        yxw yxw;
        ArrayList arrayList = new ArrayList();
        yyn yyn = null;
        yyb yyb = null;
        for (int i2 = 0; i2 < list.size(); i2++) {
            zea zea = (zea) list.get(i2);
            try {
                Activity activity = getActivity();
                boolean z = this.k;
                iva.a((Object) activity);
                iva.a((Object) zea);
                String n = zea.n();
                if (zea == null || !"pronoun".equals(zea.f())) {
                    if (zea != null) {
                        if ("customGender".equals(zea.f())) {
                            yxw = new yyb(activity, z);
                        }
                    }
                    if ("button".equals(n)) {
                        yxw = new yyg(activity, z);
                    } else if ("check".equals(n)) {
                        yxw = new yxy(activity, z);
                    } else if (zea == null || !"birthday".equals(zea.f())) {
                        if (zea != null) {
                            if ("date".equals(zea.n()) || "dayInYear".equals(zea.n())) {
                                if (zea.j()) {
                                    throw new UnsupportedOperationException("Mandatory non-birthday date fields are not supported");
                                }
                            }
                        }
                        if ("info".equals(n)) {
                            yxw = new yyh(activity, z);
                        } else if (yze.a(zea)) {
                            yxw = new yyl(activity, z);
                        } else if (!"option".equals(n)) {
                            yxw = "string".equals(n) ? new yyq(activity, z) : null;
                        } else if ("gender".equals(zea.f())) {
                            yxw = new yyd(activity, z);
                        } else if (!zea.j()) {
                            yxw = null;
                        } else {
                            throw new UnsupportedOperationException("Mandatory non-gender option fields are not supported");
                        }
                    } else {
                        yxw = new yyf(activity, z);
                    }
                } else {
                    yxw = new yyn(activity, z);
                }
                if (yxw != null) {
                    yxw.setId(i2 + 5000);
                } else if (Log.isLoggable("FieldView", 5)) {
                    String f2 = zea.f();
                    StringBuilder sb = new StringBuilder(String.valueOf(n).length() + 28 + String.valueOf(f2).length());
                    sb.append("Unsupported field: type=");
                    sb.append(n);
                    sb.append(" id=");
                    sb.append(f2);
                    Log.w("FieldView", sb.toString());
                }
                ((Boolean) ysu.J.c()).booleanValue();
                if (yxw != null) {
                    yxw.a(zea, this.a);
                    if (yxw instanceof yyd) {
                        yyd yyd = (yyd) yxw;
                        arrayList.add(yyd);
                        if (yyb != null) {
                            arrayList.add(yyb);
                        }
                        if (yyn != null) {
                            arrayList.add(yyn);
                        }
                        yyd.d = yyb;
                        yyd.e = yyn;
                        yyd.j();
                    } else if (yxw instanceof yyb) {
                        yyb = yxw;
                    } else if (!(yxw instanceof yyn)) {
                        arrayList.add(yxw);
                    } else {
                        yyn = yxw;
                    }
                }
            } catch (UnsupportedOperationException e2) {
                if (Log.isLoggable("UpgradeAccount", 5)) {
                    String n2 = zea.n();
                    String f3 = zea.f();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(n2).length() + 30 + String.valueOf(f3).length());
                    sb2.append("Failed to add field: type=");
                    sb2.append(n2);
                    sb2.append(" id=");
                    sb2.append(f3);
                    Log.w("UpgradeAccount", sb2.toString(), e2);
                }
            }
        }
        return arrayList;
    }

    private final void a(yxw yxw) {
        if (yxw.e()) {
            yxw.setVisibility(8);
        }
        if (yxw.g() != null) {
            this.a.a(yxw.g());
        }
    }

    /* access modifiers changed from: protected */
    public void a() {
        if (this.k) {
            return;
        }
        if (!this.c.a()) {
            this.d.setText(R.string.common_next);
        } else if (yze.c(this.j)) {
            this.d.setText(R.string.common_accept);
        } else {
            this.d.setText(R.string.plus_oob_join);
        }
    }

    /* access modifiers changed from: protected */
    public void a(LayoutInflater layoutInflater, View view) {
        int i2;
        if (!getArguments().getBoolean("is_setup_wizard_theme")) {
            i2 = R.layout.plus_oob_buttons;
        } else {
            i2 = R.layout.plus_oob_buttons_setup_wizard;
        }
        layoutInflater.inflate(i2, (ViewGroup) view.findViewById(R.id.buttons_layout), true);
    }

    public final void a(ScrollView scrollView, boolean z) {
        b();
        c();
    }

    public void a(UpgradeAccountEntity upgradeAccountEntity) {
        int i2;
        LinearLayout linearLayout = this.b;
        if (linearLayout != null) {
            this.j = upgradeAccountEntity;
            linearLayout.removeAllViews();
            if (upgradeAccountEntity.b() && upgradeAccountEntity.d.b()) {
                List a2 = a(upgradeAccountEntity.d.c);
                int i3 = 0;
                while (i3 < a2.size()) {
                    yxw yxw = (yxw) a2.get(i3);
                    if (!this.m || !(yxw instanceof yyl) || (i2 = i3 + 1) >= a2.size() || !(a2.get(i2) instanceof yyd)) {
                        this.b.addView(yxw);
                        a(yxw);
                    } else {
                        yxw yxw2 = (yxw) a2.get(i2);
                        LinearLayout linearLayout2 = this.b;
                        yyl yyl = (yyl) yxw;
                        yyd yyd = (yyd) yxw2;
                        LinearLayout linearLayout3 = new LinearLayout(getActivity());
                        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
                        linearLayout3.setOrientation(0);
                        linearLayout3.setLayoutParams(layoutParams);
                        linearLayout3.setGravity(80);
                        linearLayout3.addView(yyl);
                        ((LinearLayout.LayoutParams) yyl.getLayoutParams()).weight = 1.0f;
                        linearLayout3.addView(yyd);
                        ((LinearLayout.LayoutParams) yyd.getLayoutParams()).weight = 0.0f;
                        linearLayout2.addView(linearLayout3);
                        a(yxw);
                        a(yxw2);
                        i3 = i2;
                    }
                    i3++;
                }
            }
            if (yze.c(upgradeAccountEntity)) {
                this.h.setText(R.string.plus_oob_title_tos);
                this.i.setVisibility(8);
            }
            c();
        } else if (Log.isLoggable("UpgradeAccount", 5)) {
            Log.w("UpgradeAccount", "Form build requested but view has not yet been created");
        }
    }
}
