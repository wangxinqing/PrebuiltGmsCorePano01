package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.android.chimera.Activity;

/* renamed from: yok  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class yok extends ypk implements yoc {
    public static final String a;
    protected boolean b;
    public String c = "";
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private yrj i;
    private yrf o;
    private yrh p;
    private yrl q;
    private yrg r;
    private yof s;

    static {
        String str = yoq.a;
        String str2 = yoq.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 57 + String.valueOf(str2).length());
        sb.append("account_name = ? AND (data1 LIKE ? OR ");
        sb.append(str);
        sb.append(" LIKE ? OR ");
        sb.append(str2);
        sb.append(" LIKE ?)");
        a = sb.toString();
    }

    public static Bundle a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str3, String str4) {
        Bundle b2 = ypk.b(str, str2, str3, str4);
        b2.putBoolean("searchGroups", z);
        b2.putBoolean("searchCircles", z2);
        b2.putBoolean("searchPeople", z3);
        b2.putBoolean("searchWeb", z4);
        b2.putBoolean("searchDevice", z5);
        b2.putBoolean("searchEmail", z6);
        return b2;
    }

    /* access modifiers changed from: protected */
    public final View a() {
        return null;
    }

    public final void b() {
        yrl yrl = this.q;
        if (yrl.a()) {
            yrl.a(yrl.a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public yod f() {
        yod yod = new yod(getActivity(), d().m(), this.l, this.m);
        yod.b = this;
        return yod;
    }

    /* access modifiers changed from: protected */
    public final ypc d() {
        return (ypc) getActivity();
    }

    /* access modifiers changed from: protected */
    public final void e() {
        if (this.d) {
            this.p = (yrh) getLoaderManager().initLoader(0, (Bundle) null, new yoh(this));
        }
        if (this.e) {
            this.o = (yrf) getLoaderManager().initLoader(1, (Bundle) null, new yoe(this));
        }
        if (this.f) {
            this.i = (yrj) getLoaderManager().initLoader(2, (Bundle) null, new yoi(this));
        }
        if (this.g) {
            this.q = (yrl) getLoaderManager().initLoader(3, (Bundle) null, new yoj(this));
        }
        if (this.b) {
            this.s = new yof(this);
            getLoaderManager().initLoader(5, (Bundle) null, this.s);
        }
        if (this.h) {
            this.r = (yrg) getLoaderManager().initLoader(4, (Bundle) null, new yog(this));
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof ypc)) {
            throw new IllegalStateException("Activity must implement AudienceSelectionFragmentHost");
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.d = arguments.getBoolean("searchGroups");
        this.e = arguments.getBoolean("searchCircles");
        this.f = arguments.getBoolean("searchPeople");
        this.g = arguments.getBoolean("searchWeb");
        this.b = arguments.getBoolean("searchDevice");
        this.h = arguments.getBoolean("searchEmail");
    }

    public final void onStart() {
        super.onStart();
        ((yod) getListAdapter()).e();
    }

    public final void onStop() {
        ((yod) getListAdapter()).f();
        super.onStop();
    }

    public final void a(String str) {
        this.c = str;
        ((yod) getListAdapter()).a = !TextUtils.isEmpty(str);
        yrh yrh = this.p;
        if (yrh != null) {
            yrh.b(this.c);
        }
        yrf yrf = this.o;
        if (yrf != null) {
            yrf.b(this.c);
        }
        yrj yrj = this.i;
        if (yrj != null) {
            yrj.b(this.c);
        }
        yrl yrl = this.q;
        if (yrl != null) {
            yrl.a(this.c);
        }
        if (this.s != null) {
            getLoaderManager().restartLoader(5, (Bundle) null, this.s);
        }
        yrg yrg = this.r;
        if (yrg != null) {
            yrg.a(this.c);
        }
    }
}
