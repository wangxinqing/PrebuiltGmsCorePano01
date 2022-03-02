package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.gms.R;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.model.SourcedContactPerson;
import com.google.android.gms.appinvite.ui.context.section.LoaderSectionInfo;
import com.google.android.gms.appinvite.ui.context.section.SectionInfo;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: dxx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dxx extends Fragment implements TextView.OnEditorActionListener, View.OnFocusChangeListener, FragmentManager.OnBackStackChangedListener, icb, dyr, dyy {
    public int A;
    public int B;
    public abs C;
    public dxf D;
    public dxm E;
    public AdapterView.OnItemClickListener F;
    public int G;
    public int H;
    private int I;
    private String J;
    private boolean K;
    private String[] L;
    private boolean M;
    private boolean N;
    private final eao O = new eao();
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S = false;
    public Context a;
    public icc b;
    public String c;
    public int d;
    public dyd e;
    public dyf f;
    public dye g;
    public boolean h;
    public SparseIntArray i;
    public SparseIntArray j;
    public View k;
    public boolean l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;
    public String p;
    public View q;
    public ArrayList r = new ArrayList();
    public dzw s;
    public dym t;
    public dyj u;
    public List v;
    public final SparseBooleanArray w = new SparseBooleanArray();
    public dxv x;
    public CharSequence y;
    public boolean z;

    public static dxx a(String str, int i2, ArrayList arrayList, boolean z2, Bundle bundle, boolean z3, String[] strArr, boolean z4, int i3, int i4, ArrayList arrayList2, String str2, boolean z5, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, String str3, boolean z6) {
        dxx dxx = new dxx();
        Bundle bundle2 = new Bundle();
        String str4 = str;
        bundle2.putString("accountName", str);
        int i5 = i2;
        bundle2.putInt("maxSelected", i2);
        ArrayList arrayList6 = arrayList;
        bundle2.putParcelableArrayList("initialSelection", arrayList);
        boolean z7 = z2;
        bundle2.putBoolean("allowContactMethodSelection", z2);
        Bundle bundle3 = bundle;
        bundle2.putBundle("methodData", bundle);
        boolean z8 = z3;
        bundle2.putBoolean("hideMethodIcon", z3);
        String[] strArr2 = strArr;
        bundle2.putStringArray("searchMethodOrder", strArr);
        boolean z9 = z4;
        bundle2.putBoolean("excludeNonGaiaContacts", z4);
        int i6 = i3;
        bundle2.putInt("numPortraitColumns", i3);
        int i7 = i4;
        bundle2.putInt("numLandscapeColumns", i4);
        ArrayList arrayList7 = arrayList2;
        bundle2.putParcelableArrayList("sections", arrayList2);
        String str5 = str2;
        bundle2.putString("callingPackageName", str2);
        bundle2.putBoolean("includePublicSearch", z5);
        bundle2.putStringArrayList("disabledGaiaIds", arrayList3);
        bundle2.putStringArrayList("disabledEmailAddresses", arrayList4);
        bundle2.putStringArrayList("disabledPhoneNumbers", arrayList5);
        bundle2.putString("disabledMessage", str3);
        bundle2.putBoolean("enableSmsWarning", z6);
        dxx.setArguments(bundle2);
        return dxx;
    }

    public static boolean c(ContactPerson contactPerson) {
        ContactPerson.ContactMethod a2 = contactPerson.a();
        return a2 != null && a2.a == 2;
    }

    private final boolean f() {
        FragmentManager fragmentManager = getFragmentManager();
        for (int i2 = 0; i2 < fragmentManager.getBackStackEntryCount(); i2++) {
            FragmentManager.BackStackEntry backStackEntryAt = fragmentManager.getBackStackEntryAt(i2);
            if (backStackEntryAt != null && "searchMode".equals(backStackEntryAt.getName())) {
                return true;
            }
        }
        return false;
    }

    private final void g() {
        dzw dzw = this.s;
        if (dzw != null) {
            dzw.post(new dxr(this));
        }
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.r;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((SourcedContactPerson) arrayList2.get(i2)).a);
        }
        return arrayList;
    }

    public final int d(ContactPerson contactPerson) {
        for (int i2 = 0; i2 < this.r.size(); i2++) {
            if (((SourcedContactPerson) this.r.get(i2)).a.equals(contactPerson)) {
                return i2;
            }
        }
        return -1;
    }

    public final void e() {
        if (this.N && !this.l && this.k == null) {
            View a2 = eat.a(getActivity(), this.a.getString(R.string.appinvite_contextual_selection_sms_warning), true, false, 0, new dxu(this));
            this.k = a2;
            if (a2 == null) {
                this.l = true;
            }
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.b == null) {
            wlr a2 = wls.a();
            a2.a = 80;
            wls a3 = a2.a();
            ibz ibz = new ibz(getActivity().getApplicationContext());
            ibz.a(this.c);
            ibz.a((icb) this);
            ibz.a(wlt.a, (ibj) a3);
            this.b = ibz.b();
            wlh wlh = new wlh();
            wlh.a = 0;
            wlh.b();
            wlh.a();
        }
        dxm dxm = new dxm(this.a, this.R, this.h, this.c, this.L, getLoaderManager());
        this.E = dxm;
        dxm.m = this.z;
        dxm.d = this.b;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!a((Context) activity)) {
            ihs b2 = ihs.b();
            if (a((Context) b2)) {
                b2.setTheme(2132018404);
                this.a = b2;
                return;
            }
            Log.e("CPSelectionFragment", "Couldn't find Context with AppInvite resources mapped correctly. Using Activity that doesn't have resources mapped, which may fail.");
        }
        this.a = activity;
    }

    public final void onBackStackChanged() {
        if (this.Q && !f()) {
            b(false);
        }
    }

    public final void onCreate(Bundle bundle) {
        ArrayList parcelableArrayList;
        String str;
        super.onCreate(bundle);
        if (this.A == 0) {
            this.A = this.a.getResources().getColor(R.color.material_google_blue_500);
        }
        if (this.B == 0) {
            this.B = this.a.getResources().getColor(R.color.material_teal_500);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.c = arguments.getString("accountName");
            this.d = arguments.getInt("maxSelected");
            this.h = arguments.getBoolean("allowContactMethodSelection");
            this.K = arguments.getBoolean("hideMethodIcon");
            this.L = arguments.getStringArray("searchMethodOrder");
            this.M = arguments.getBoolean("excludeNonGaiaContacts");
            if (getResources().getConfiguration().orientation != 2) {
                str = "numPortraitColumns";
            } else {
                str = "numLandscapeColumns";
            }
            this.I = arguments.getInt(str);
            this.v = arguments.getParcelableArrayList("sections");
            this.J = arguments.getString("callingPackageName");
            this.R = arguments.getBoolean("includePublicSearch");
            this.m = arguments.getStringArrayList("disabledGaiaIds");
            this.n = arguments.getStringArrayList("disabledEmailAddresses");
            this.o = arguments.getStringArrayList("disabledPhoneNumbers");
            this.p = arguments.getString("disabledMessage");
            this.N = arguments.getBoolean("enableSmsWarning");
            Bundle bundle2 = arguments.getBundle("methodData");
            if (bundle2 != null && bundle2.containsKey("methodIcons")) {
                this.i = new SparseIntArray();
                Bundle bundle3 = bundle2.getBundle("methodIcons");
                for (String str2 : bundle3.keySet()) {
                    this.i.put(Integer.parseInt(str2), bundle3.getInt(str2));
                }
            }
            if (bundle2 != null && bundle2.containsKey("croppedMethodIcons")) {
                this.j = new SparseIntArray();
                Bundle bundle4 = bundle2.getBundle("croppedMethodIcons");
                for (String str3 : bundle4.keySet()) {
                    this.j.put(Integer.parseInt(str3), bundle4.getInt(str3));
                }
            }
        }
        this.t = new dym();
        for (int i2 = 0; i2 < this.v.size(); i2++) {
            SectionInfo sectionInfo = (SectionInfo) this.v.get(i2);
            dym dym = this.t;
            dyj a2 = sectionInfo.a(this, this.I);
            a2.a((aci) new dyl(dym, a2));
            dym.f.add(a2);
            if (sectionInfo.p) {
                this.t.g = i2;
                dyj b2 = sectionInfo.b(this, this.I);
                this.u = b2;
                b2.c(this.z);
                this.u.d(this.h);
                this.u.e(this.K);
            }
        }
        this.t.c(this.z);
        this.t.d(this.h);
        this.t.e(this.K);
        if (bundle != null) {
            this.r = bundle.getParcelableArrayList("selectedPeople");
            this.l = bundle.getBoolean("smsWarningAcknowledged");
            this.Q = bundle.getBoolean("searchMode");
            this.y = bundle.getCharSequence("searchText");
            a(bundle.getBoolean("editMode"), true);
        } else if (!(arguments == null || !arguments.containsKey("initialSelection") || (parcelableArrayList = arguments.getParcelableArrayList("initialSelection")) == null)) {
            this.r = new ArrayList();
            int size = parcelableArrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                this.r.add(new SourcedContactPerson((ContactPerson) parcelableArrayList.get(i3), 0));
            }
        }
        a(b());
    }

    public final void onDetach() {
        super.onDetach();
        this.a = null;
    }

    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        if (i2 != 6) {
            return false;
        }
        if (this.E.getCount() == 1) {
            a(0);
        } else {
            jjw.a(getActivity(), textView);
        }
        return true;
    }

    public final void onFocusChange(View view, boolean z2) {
        dye dye;
        if (!z2 && !this.S && (dye = this.g) != null) {
            dye.a(false);
        }
    }

    public final void onPause() {
        super.onPause();
        if (this.k != null) {
            eat.b(getActivity(), this.k);
        }
        if (this.q != null) {
            eat.b(getActivity(), this.q);
            this.q = null;
        }
        if (this.Q) {
            this.y = this.t.e();
        }
        getFragmentManager().removeOnBackStackChangedListener(this);
    }

    public final void onResume() {
        super.onResume();
        if (this.k != null) {
            eat.a((Context) getActivity(), this.k);
        }
        if (this.Q) {
            g();
        }
        getFragmentManager().addOnBackStackChangedListener(this);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("selectedPeople", new ArrayList(this.r));
        bundle.putBoolean("smsWarningAcknowledged", this.l);
        bundle.putBoolean("editMode", this.P);
        bundle.putBoolean("searchMode", this.Q);
        dym dym = this.t;
        if (dym != null) {
            bundle.putCharSequence("searchText", dym.e());
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStart() {
        /*
            r14 = this;
            super.onStart()
            icc r0 = r14.b
            r1 = 0
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.i()
            if (r0 != 0) goto L_0x001d
            icc r0 = r14.b
            boolean r0 = r0.j()
            if (r0 != 0) goto L_0x001d
            icc r0 = r14.b
            r0.e()
            r0 = 0
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            java.util.List r2 = r14.v
            int r2 = r2.size()
            r3 = -1
            r4 = 0
            if (r0 >= r2) goto L_0x00fa
            android.util.SparseBooleanArray r2 = r14.w
            boolean r2 = r2.get(r0, r1)
            if (r2 != 0) goto L_0x00f6
            java.util.List r2 = r14.v
            java.lang.Object r2 = r2.get(r0)
            boolean r2 = r2 instanceof com.google.android.gms.appinvite.ui.context.section.LoaderSectionInfo
            r5 = 1
            if (r2 == 0) goto L_0x00f1
            java.util.List r2 = r14.v
            java.lang.Object r2 = r2.get(r0)
            com.google.android.gms.appinvite.ui.context.section.LoaderSectionInfo r2 = (com.google.android.gms.appinvite.ui.context.section.LoaderSectionInfo) r2
            java.lang.String r6 = r2.a
            if (r6 == 0) goto L_0x00c4
            int r7 = r6.hashCode()
            r8 = 3
            r9 = 2
            switch(r7) {
                case -991808881: goto L_0x006f;
                case -184842003: goto L_0x0065;
                case 315730723: goto L_0x005b;
                case 782949795: goto L_0x0051;
                default: goto L_0x0050;
            }
        L_0x0050:
            goto L_0x0079
        L_0x0051:
            java.lang.String r7 = "circles"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0079
            r6 = 3
            goto L_0x007a
        L_0x005b:
            java.lang.String r7 = "suggested"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0079
            r6 = 2
            goto L_0x007a
        L_0x0065:
            java.lang.String r7 = "identityPeople"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0079
            r6 = 1
            goto L_0x007a
        L_0x006f:
            java.lang.String r7 = "people"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0079
            r6 = 0
            goto L_0x007a
        L_0x0079:
            r6 = -1
        L_0x007a:
            if (r6 == 0) goto L_0x00b8
            if (r6 == r5) goto L_0x00a6
            if (r6 == r9) goto L_0x0090
            if (r6 == r8) goto L_0x0084
            r6 = r4
            goto L_0x00c5
        L_0x0084:
            dyz r6 = new dyz
            com.google.android.chimera.Activity r7 = r14.getActivity()
            java.lang.String r8 = r14.c
            r6.<init>(r7, r8, r2)
            goto L_0x00c5
        L_0x0090:
            dzd r13 = new dzd
            com.google.android.chimera.Activity r7 = r14.getActivity()
            java.lang.String r8 = r14.c
            java.lang.String r9 = r14.J
            dye r12 = r14.g
            dwj r11 = defpackage.dwj.a((android.content.Context) r7)
            r6 = r13
            r10 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L_0x00c5
        L_0x00a6:
            dzg r12 = new dzg
            com.google.android.chimera.Activity r7 = r14.getActivity()
            java.lang.String r8 = r14.c
            dye r10 = r14.g
            boolean r11 = r14.M
            r6 = r12
            r9 = r2
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x00c5
        L_0x00b8:
            dzh r6 = new dzh
            com.google.android.chimera.Activity r7 = r14.getActivity()
            java.lang.String r8 = r14.c
            r6.<init>(r7, r8, r2)
            goto L_0x00c5
        L_0x00c4:
            r6 = r4
        L_0x00c5:
            if (r6 == 0) goto L_0x00d4
            com.google.android.chimera.LoaderManager r2 = r14.getLoaderManager()
            dxw r3 = new dxw
            r3.<init>(r14, r6)
            r2.initLoader(r0, r4, r3)
            goto L_0x00f6
        L_0x00d4:
            java.lang.String r6 = r2.a
            java.lang.String r7 = "supplied"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x00e9
            java.util.ArrayList r2 = r2.l
            r14.a((int) r0, (java.util.List) r2)
            android.util.SparseBooleanArray r2 = r14.w
            r2.put(r0, r5)
            goto L_0x00f6
        L_0x00e9:
            dyd r2 = r14.e
            if (r2 == 0) goto L_0x00f6
            r2.e()
            goto L_0x00fe
        L_0x00f1:
            android.util.SparseBooleanArray r2 = r14.w
            r2.put(r0, r5)
        L_0x00f6:
            int r0 = r0 + 1
            goto L_0x001e
        L_0x00fa:
            r14.c((boolean) r1)
        L_0x00fe:
            dxm r0 = r14.E
            boolean r1 = r0.f
            if (r1 == 0) goto L_0x0110
            com.google.android.chimera.LoaderManager r1 = r0.q
            dxj r2 = r0.s
            com.google.android.chimera.Loader r1 = r1.initLoader(r3, r4, r2)
            dzj r1 = (defpackage.dzj) r1
            r0.r = r1
        L_0x0110:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxx.onStart():void");
    }

    public final void onStop() {
        super.onStop();
        icc icc = this.b;
        if (icc != null) {
            icc.g();
        }
        abs abs = this.C;
        if (abs != null) {
            abs.d();
            this.C = null;
        }
        dxm dxm = this.E;
        if (dxm.f) {
            dxm.q.destroyLoader(-1);
        }
    }

    private final void a(ContactPerson contactPerson, boolean z2) {
        int i2;
        String a2 = eap.a(this.a, contactPerson);
        Context context = this.a;
        if (!z2) {
            i2 = R.string.appinvite_recipient_not_selected;
        } else {
            i2 = R.string.appinvite_recipient_selected;
        }
        String string = context.getString(i2);
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 1 + String.valueOf(string).length());
        sb.append(a2);
        sb.append(" ");
        sb.append(string);
        String sb2 = sb.toString();
        getActivity();
        eat.a((View) this.s, (CharSequence) sb2);
    }

    public final void b(ContactPerson contactPerson, int i2, int i3) {
        int i4 = 5;
        if (i2 == 1) {
            i4 = 2;
        } else if (i2 == 2) {
            i4 = 3;
        } else if (i2 == 3) {
            i4 = 4;
        } else if (i2 != 5) {
            i4 = 1;
        }
        SourcedContactPerson sourcedContactPerson = new SourcedContactPerson(contactPerson, i4 - 1);
        int d2 = d(contactPerson);
        if (this.r.size() < this.d) {
            if (d2 < 0) {
                this.r.add(sourcedContactPerson);
                this.t.a(contactPerson);
                dyj dyj = this.u;
                if (dyj != null) {
                    dyj.a(contactPerson);
                }
                a(contactPerson, true);
            } else {
                this.r.set(d2, sourcedContactPerson);
                this.t.b(contactPerson);
                dyj dyj2 = this.u;
                if (dyj2 != null) {
                    dyj2.b(contactPerson);
                }
            }
            if (c(contactPerson)) {
                e();
            }
            dyf dyf = this.f;
            if (dyf != null) {
                dyf.a(contactPerson, true);
            }
        } else if (d2 < 0) {
            Toast.makeText(getActivity(), this.a.getString(R.string.appinvite_contextual_selection_limit), 0).show();
        }
        dye dye = this.g;
        if (dye != null) {
            dye.a(contactPerson, i2, i3, true);
        }
    }

    public final int c() {
        return this.r.size();
    }

    public final void d() {
        abs abs = new abs(this.a);
        this.C = abs;
        abs.f = -2;
        abs.l();
        this.C.m = new dxs(this);
        dxf dxf = new dxf(this.a, this.i, new dxt(this));
        this.D = dxf;
        dxf.notifyDataSetChanged();
        dxf dxf2 = this.D;
        dxf2.b = this.h;
        dxf2.c = this.A;
        this.C.a((ListAdapter) dxf2);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = Build.VERSION.SDK_INT;
        dzw dzw = new dzw(this.a);
        this.s = dzw;
        dzw.g = this;
        dzw.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        eai eai = (eai) this.s.a;
        if (!eai.d) {
            eai.d = true;
            if (eai.c != Thread.currentThread()) {
                eai.post(new eag(eai));
            } else {
                eai.a();
            }
        }
        this.s.a.setHasFixedSize(true);
        this.s.setFocusableInTouchMode(true);
        this.s.a(this.B);
        abd abd = new abd(this.I, (byte[]) null);
        dxn dxn = new dxn(this);
        dxn.c = true;
        abd.g = dxn;
        this.s.a.setLayoutManager(abd);
        this.s.a.b = new dxo(this);
        b(this.Q);
        if (!TextUtils.isEmpty(this.y)) {
            g();
        }
        return this.s;
    }

    public final void c(boolean z2) {
        if (a()) {
            this.t.c(this.z);
            this.t.f(this.A);
            dyj dyj = this.u;
            if (dyj != null) {
                dyj.c(this.z);
                this.u.f(this.A);
            }
            dzw dzw = this.s;
            dym dym = this.t;
            dzw.b = dym;
            dzw.a.setAdapter(dym);
            dzw dzw2 = this.s;
            dyj dyj2 = this.u;
            dzw2.c = dyj2;
            int i2 = 0;
            if (dyj2 == null) {
                dzw2.e = false;
            } else {
                if (dzw2.d == null) {
                    dzw2.d = new dzv(dzw2.getContext());
                    int i3 = 0;
                    while (i3 < dzw2.getChildCount()) {
                        boolean equals = dzw2.getChildAt(i3).equals(dzw2.a);
                        i3++;
                        if (equals) {
                            break;
                        }
                    }
                    dzw2.addView(dzw2.d, i3, new FrameLayout.LayoutParams(-1, -2));
                }
                dzv dzv = dzw2.d;
                acg acg = dzv.a;
                if (acg != dyj2) {
                    if (acg != null) {
                        acg.b((aci) dzv.d);
                    }
                    dzv.a = dyj2;
                    dyj2.a((aci) dzv.d);
                    dzv.a();
                }
                dzw2.e = true;
            }
            while (true) {
                if (i2 < this.r.size()) {
                    if (c(((SourcedContactPerson) this.r.get(i2)).a)) {
                        e();
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
            dyd dyd = this.e;
            if (dyd == null) {
                return;
            }
            if (!z2) {
                dyd.a(this.G, this.H);
            } else {
                dyd.b(this.G, this.H);
            }
        }
    }

    private final void a(List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            ContactPerson contactPerson = (ContactPerson) list.get(i2);
            ContactPerson a2 = this.O.a(contactPerson);
            if (a2 != contactPerson) {
                list.set(i2, a2);
            }
        }
    }

    private final void a(boolean z2, boolean z3) {
        if (z3 || this.P != z2) {
            this.P = z2;
            dyj dyj = this.u;
            if (dyj != null) {
                dyj.b(z2);
            }
            this.t.b(this.P);
            if (!this.P) {
                b(false);
            } else if (!z3 && this.r.size() == 0) {
                b(true);
            }
        }
    }

    private static boolean a(Context context) {
        if (context != null) {
            try {
                Resources resources = context.getResources();
                String resourceEntryName = resources.getResourceEntryName(R.string.common_choose_account);
                String resourceTypeName = resources.getResourceTypeName(R.string.common_choose_account);
                if (!"common_choose_account".equals(resourceEntryName) || !"string".equals(resourceTypeName)) {
                    return false;
                }
                return true;
            } catch (Resources.NotFoundException e2) {
            }
        }
        return false;
    }

    public final List a(int i2, List list) {
        int i3;
        String str;
        String str2;
        String str3;
        dyq dyq = (dyq) ((dyj) this.t.f.get(i2));
        LoaderSectionInfo loaderSectionInfo = (LoaderSectionInfo) this.v.get(i2);
        if (!(loaderSectionInfo.m == null && loaderSectionInfo.n == null && loaderSectionInfo.o == null)) {
            ArrayList arrayList = new ArrayList(list);
            eap.a((List) arrayList, (List) loaderSectionInfo.m, (List) loaderSectionInfo.n, (List) loaderSectionInfo.o);
            list = arrayList;
        }
        if (getResources().getConfiguration().orientation == 2) {
            i3 = loaderSectionInfo.k;
        } else {
            i3 = loaderSectionInfo.j;
        }
        List subList = list.subList(0, Math.min(i3, list.size()));
        a(subList);
        dyq.m.clear();
        dyq.m.addAll(subList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (!TextUtils.isEmpty(dyq.j)) {
            if (!dyq.i) {
                str2 = "";
            } else {
                str2 = dyq.j;
            }
            arrayList2.add(str2);
            arrayList3.add(0);
        } else if (!TextUtils.isEmpty(dyq.k)) {
            if (!dyq.i) {
                str3 = "";
            } else {
                str3 = dyq.k;
            }
            arrayList2.add(str3);
            arrayList3.add(0);
        }
        if (dyq.h) {
            String str4 = "";
            for (int i4 = 0; i4 < dyq.m.size(); i4++) {
                if (((ContactPerson) dyq.m.get(i4)).a == null || ((ContactPerson) dyq.m.get(i4)).a.length() <= 0) {
                    str = "";
                } else {
                    str = ((ContactPerson) dyq.m.get(i4)).a.substring(0, 1).toUpperCase();
                }
                if (!str.equals(str4)) {
                    arrayList2.add(str);
                    arrayList3.add(Integer.valueOf(dyq.l + i4));
                    str4 = str;
                }
            }
        }
        arrayList3.add(Integer.valueOf(dyq.a()));
        dyq.n = arrayList2.toArray();
        dyq.o = new int[arrayList3.size()];
        for (int i5 = 0; i5 < arrayList3.size(); i5++) {
            dyq.o[i5] = ((Integer) arrayList3.get(i5)).intValue();
        }
        dyq.as();
        return subList;
    }

    public final void b(boolean z2) {
        this.Q = z2;
        dzw dzw = this.s;
        if (dzw != null) {
            boolean z3 = !z2;
            if (dzw.f != z3) {
                dzw.f = z3;
                dzw.a();
            }
            this.t.f(z2);
            if (z2) {
                this.S = false;
                this.s.post(new dxq(this));
                if (isResumed() && !f()) {
                    getFragmentManager().beginTransaction().addToBackStack("searchMode").commit();
                    return;
                }
                return;
            }
            this.t.a((CharSequence) null);
            dyj dyj = this.u;
            if (dyj != null) {
                dyj.a((CharSequence) null);
            }
            jjw.a(getActivity(), this.s);
            if (isResumed()) {
                getFragmentManager().popBackStack("searchMode", 1);
            }
        }
    }

    public final boolean b(ContactPerson contactPerson) {
        return eap.a(contactPerson, (List) this.m, (List) this.n, (List) this.o);
    }

    public final void a(int i2) {
        int itemViewType = this.E.getItemViewType(i2);
        dxm dxm = this.E;
        if (itemViewType == dxm.a) {
            this.S = true;
            dxl dxl = (dxl) dxm.getItem(i2);
            ContactPerson.ContactMethod contactMethod = dxl.b;
            if (contactMethod != null) {
                dxl.a.a(contactMethod);
            }
            b(this.O.a(dxl.a), dxl.c, i2);
            b(false);
            dye dye = this.g;
            if (dye != null) {
                dye.a(true);
            }
        }
    }

    public final void a(ContactPerson contactPerson, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.r.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            if (eap.d(contactPerson, ((SourcedContactPerson) it.next()).a)) {
                it.remove();
                arrayList.add(Integer.valueOf(i4));
            }
            i4++;
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            Integer num = (Integer) arrayList.get(i5);
            this.t.a(contactPerson, num.intValue());
            dyj dyj = this.u;
            if (dyj != null) {
                dyj.a(contactPerson, num.intValue());
            }
        }
        a(contactPerson, false);
        dyf dyf = this.f;
        if (dyf != null) {
            dyf.a(contactPerson, false);
        }
        dye dye = this.g;
        if (dye != null) {
            dye.a(contactPerson, i2, i3, false);
        }
    }

    public final void a(ConnectionResult connectionResult) {
        this.b.h();
    }

    public final void a(boolean z2) {
        a(z2, false);
    }

    public final boolean a() {
        for (int i2 = 0; i2 < this.v.size(); i2++) {
            if (!this.w.get(i2, false)) {
                return false;
            }
        }
        return true;
    }

    public final boolean a(ContactPerson contactPerson) {
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            if (eap.d(((SourcedContactPerson) arrayList.get(i2)).a, contactPerson)) {
                return true;
            }
            i2 = i3;
        }
        return false;
    }
}
