package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.gms.plus.audience.AudienceSelectionListView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ypj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ypj extends ypk {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    public boolean e;
    public String f;
    public int g;
    public int h;
    public int i;
    private Integer o;
    private boolean p;
    private boolean q = true;
    private List r;

    public static Bundle a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Integer num, boolean z5, String str3, String str4, String str5, boolean z6, boolean z7, int i2, int i3, int i4, List list) {
        List list2 = list;
        String str6 = str;
        String str7 = str2;
        String str8 = str4;
        String str9 = str5;
        Bundle b2 = ypk.b(str, str2, str4, str5);
        boolean z8 = z;
        b2.putBoolean("loadSuggested", z);
        boolean z9 = z2;
        b2.putBoolean("loadGroups", z2);
        boolean z10 = z3;
        b2.putBoolean("loadCircles", z3);
        boolean z11 = z4;
        b2.putBoolean("loadPeople", z4);
        if (num != null) {
            b2.putInt("loadPeopleType", num.intValue());
        }
        boolean z12 = z5;
        b2.putBoolean("requestCircleVisibility", z5);
        String str10 = str3;
        b2.putString("description", str3);
        b2.putBoolean("headerVisible", z6);
        b2.putBoolean("includeSuggestions", z7);
        b2.putInt("maxSuggestedImages", i2);
        b2.putInt("maxSuggestedListItems", i3);
        b2.putInt("maxSuggestedDevice", i4);
        if (list2 != null) {
            b2.putParcelableArrayList("excludedSuggestions", new ArrayList(list2));
        }
        return b2;
    }

    /* access modifiers changed from: protected */
    public ypc b() {
        return (ypc) getActivity();
    }

    /* access modifiers changed from: protected */
    public final ypb c() {
        return (ypb) getActivity();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public yoy f() {
        yoy yoy = new yoy(getActivity(), g(), this.l, this.m, this.p, this.g, this.h, this.r, b().a(), yuv.a);
        if (this.n) {
            yoy.e();
        }
        return yoy;
    }

    /* access modifiers changed from: protected */
    public final void e() {
        if (this.a && (this.g > 0 || this.h > 0)) {
            if (this.i > 0) {
                getLoaderManager().initLoader(4, (Bundle) null, new ype(this));
            }
            getLoaderManager().initLoader(5, (Bundle) null, new ypi(this));
        }
        if (this.b) {
            getLoaderManager().initLoader(0, (Bundle) null, new ypf(this));
        }
        if (this.c) {
            getLoaderManager().initLoader(1, (Bundle) null, new ypd(this));
        }
        if (!this.d) {
            return;
        }
        if (this.o.intValue() == 1) {
            getLoaderManager().initLoader(6, (Bundle) null, new ypa(this));
        } else if (this.q) {
            getLoaderManager().restartLoader(3, (Bundle) null, new yph(this));
        } else {
            getLoaderManager().initLoader(2, (Bundle) null, new ypg(this));
        }
    }

    public final yqd g() {
        return b().m();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (b().a()) {
            yqb yqb = (yqb) c();
            AudienceSelectionListView audienceSelectionListView = (AudienceSelectionListView) getListView();
            audienceSelectionListView.setOnScrollListener(yqb);
            audienceSelectionListView.a = yqb;
            audienceSelectionListView.b = yqb;
            ((yoy) getListAdapter()).e = yqb;
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof ypc)) {
            throw new IllegalStateException("Activity must implement AudienceSelectionFragmentHost");
        } else if (b().a() && !(activity instanceof yqb)) {
            throw new IllegalStateException("Activity must extend AudienceSelectionScrollViewChimeraActivity");
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.a = arguments.getBoolean("loadSuggested");
        this.b = arguments.getBoolean("loadGroups");
        this.c = arguments.getBoolean("loadCircles");
        this.d = arguments.getBoolean("loadPeople");
        this.o = Integer.valueOf(arguments.getInt("loadPeopleType"));
        this.e = arguments.getBoolean("requestCircleVisibility");
        this.f = arguments.getString("description");
        this.p = arguments.getBoolean("headerVisible");
        this.q = arguments.getBoolean("includeSuggestions");
        this.g = arguments.getInt("maxSuggestedImages");
        this.h = arguments.getInt("maxSuggestedListItems");
        this.i = arguments.getInt("maxSuggestedDevice");
        if (arguments.containsKey("excludedSuggestions")) {
            this.r = arguments.getParcelableArrayList("excludedSuggestions");
        }
    }

    public void onStart() {
        super.onStart();
        ((yoy) getListAdapter()).e();
    }

    public void onStop() {
        ((yoy) getListAdapter()).f();
        super.onStop();
    }

    public static ypj a(String str, String str2, String str3, String str4) {
        Bundle a2 = a(str, str2, false, false, true, false, (Integer) null, false, (String) null, str3, str4, false, false, 0, 0, 0, (List) null);
        ypj ypj = new ypj();
        ypj.setArguments(a2);
        return ypj;
    }
}
