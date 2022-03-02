package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.plus.audience.AudienceSelectionListCircleView;
import com.google.android.gms.plus.audience.AudienceSelectionListPersonView;
import com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: yoy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class yoy extends zno implements ypn, yqc {
    public static final /* synthetic */ int E = 0;
    public int A;
    public int B;
    public int C;
    public final iqj D;
    private boolean F;
    private ilh G;
    private List H;
    private List I;
    private final you J;
    private final znl K;
    private zni L;
    private zni Q;
    private zni R;
    private final icc S;
    private final Map T;
    private final yui a;
    private final boolean b;
    private final int c;
    private final int d;
    public View.OnClickListener e;
    protected final int f;
    protected final int g;
    protected final int h;
    protected final int i;
    protected final int j;
    protected final int k;
    public final yqd l;
    public final String m;
    public final String n;
    public final int o;
    public final List p;
    public Cursor q;
    public PeopleFeed r;
    public int s;
    public boolean t;
    public Context u;
    public zni v;
    public zni w;
    public zni x;
    public zni y;
    public zni z;

    public yoy(Context context, yqd yqd, String str, String str2, boolean z2) {
        this(context, yqd, str, str2, z2, 0, 0, (List) null, false, yuv.a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.google.android.gms.common.people.data.AudienceMember} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final com.google.android.gms.common.people.data.AudienceMember a(defpackage.zhr r6) {
        /*
            java.lang.String r0 = r6.d()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = r6.d()
            java.lang.String r3 = r6.b()
            boolean r4 = r6.f()
            if (r4 == 0) goto L_0x0023
            zhp r2 = r6.e()
            java.lang.String r2 = r2.b()
            goto L_0x0024
        L_0x0023:
        L_0x0024:
            com.google.android.gms.common.people.data.AudienceMember r2 = com.google.android.gms.common.people.data.AudienceMember.a(r0, r3, r2)
            goto L_0x008a
        L_0x0029:
            java.util.List r0 = r6.c()
            if (r0 == 0) goto L_0x0089
            java.util.List r0 = r6.c()
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0089
            java.util.List r0 = r6.c()
            java.lang.Object r0 = r0.get(r1)
            zho r0 = (defpackage.zho) r0
            java.lang.String r0 = r0.b()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0089
            java.util.List r0 = r6.c()
            java.lang.Object r0 = r0.get(r1)
            zho r0 = (defpackage.zho) r0
            java.lang.String r0 = r0.b()
            java.lang.String r3 = defpackage.ycm.h(r0)
            java.lang.String r4 = r6.b()
            boolean r5 = r6.f()
            if (r5 == 0) goto L_0x0072
            zhp r2 = r6.e()
            java.lang.String r2 = r2.b()
            goto L_0x0073
        L_0x0072:
        L_0x0073:
            com.google.android.gms.common.people.data.AudienceMember r2 = com.google.android.gms.common.people.data.AudienceMember.b(r3, r4, r2)
            java.lang.String r3 = r6.b()
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L_0x008a
            android.os.Bundle r3 = r2.h
            java.lang.String r4 = "secondaryText"
            r3.putString(r4, r0)
            goto L_0x008a
        L_0x0089:
        L_0x008a:
            if (r2 == 0) goto L_0x00c3
            android.os.Bundle r0 = r2.h
            java.lang.String r3 = "contactType"
            r0.putInt(r3, r1)
            boolean r0 = r6.j()
            if (r0 == 0) goto L_0x00b2
            zhq r0 = r6.i()
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x00b2
            android.os.Bundle r0 = r2.h
            zhq r1 = r6.i()
            boolean r1 = r1.b()
            java.lang.String r3 = "isCircled"
            r0.putBoolean(r3, r1)
        L_0x00b2:
            boolean r0 = r6.h()
            if (r0 == 0) goto L_0x00c3
            android.os.Bundle r0 = r2.h
            java.lang.String r6 = r6.g()
            java.lang.String r1 = "objectType"
            r0.putString(r1, r6)
        L_0x00c3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yoy.a(zhr):com.google.android.gms.common.people.data.AudienceMember");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean a() {
        /*
            r2 = this;
            yqd r0 = r2.l
            if (r0 == 0) goto L_0x000f
            com.google.android.gms.common.people.data.Audience r0 = r0.a
            if (r0 == 0) goto L_0x000f
            int r0 = r0.c
            r1 = 1
            if (r0 == r1) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            return r1
        L_0x000f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yoy.a():boolean");
    }

    /* access modifiers changed from: protected */
    public final AudienceSelectionListCircleView b(wzs wzs, View view, ViewGroup viewGroup, boolean z2) {
        AudienceSelectionListCircleView a2 = a(wzs, view, viewGroup, z2);
        int e2 = wzs.e();
        if (e2 == 1) {
            a2.a(R.drawable.plus_ic_public_24dp);
        } else if (e2 == 2) {
            a2.a(R.drawable.plus_ic_domain_24dp);
        } else if (e2 == 3) {
            a2.a(R.drawable.ic_circles_24dp);
        } else if (e2 == 4) {
            a2.a(R.drawable.plus_ic_circles_extended_24dp);
        }
        return a2;
    }

    /* access modifiers changed from: protected */
    public zni c() {
        int i2;
        if (this.F) {
            this.F = false;
            if (this.G != null) {
                for (int i3 = 0; i3 < this.G.a(); i3++) {
                    this.T.remove(((xfj) this.G.a(i3)).a());
                }
            }
            if (this.p != null) {
                for (int i4 = 0; i4 < this.p.size(); i4++) {
                    this.T.remove(((AudienceMember) this.p.get(i4)).e);
                }
            }
            if (this.H != null) {
                for (int i5 = 0; i5 < this.H.size(); i5++) {
                    this.T.remove(((AudienceMember) this.H.get(i5)).e);
                }
            }
            this.R = new znm(this, (int) R.string.plus_audience_selection_header_search, "🔍", (zni) new yow(this, this.T.values()));
        }
        zni[] zniArr = new zni[6];
        zniArr[0] = this.R;
        zniArr[1] = this.z;
        if (!this.b) {
            i2 = 0;
        } else {
            i2 = R.string.plus_audience_selection_header_circles;
        }
        zniArr[2] = new znm(this, i2, "◯", (zni) new znh(this.v, this.w));
        zniArr[3] = this.y;
        zniArr[4] = !d() ? this.K : this.J;
        zniArr[5] = this.x;
        return new znh(zniArr);
    }

    /* access modifiers changed from: protected */
    public boolean d() {
        zni zni;
        zni zni2 = this.v;
        if (zni2 != null && !zni2.b()) {
            return false;
        }
        zni zni3 = this.w;
        if (zni3 != null && !zni3.b()) {
            return false;
        }
        zni zni4 = this.y;
        if (zni4 == null) {
            return true;
        }
        if (!zni4.b() || ((zni = this.z) != null && !zni.b())) {
            return false;
        }
        return true;
    }

    public void e() {
        this.l.a(this);
        this.S.e();
    }

    public void f() {
        this.l.b(this);
        this.S.g();
    }

    /* access modifiers changed from: protected */
    public final void g() {
        a(c());
    }

    public final boolean isEnabled(int i2) {
        return getItemViewType(i2) != this.O;
    }

    public yoy(Context context, yqd yqd, String str, String str2, boolean z2, int i2, int i3, List list, boolean z3, yui yui) {
        super(context);
        this.f = i();
        this.g = i();
        this.h = i();
        this.i = i();
        this.j = i();
        this.k = i();
        this.J = new you(this);
        this.K = new znl();
        this.T = new LinkedHashMap();
        this.D = new iqj(5242880);
        this.u = context;
        this.l = yqd;
        this.m = str;
        this.n = str2;
        this.b = z2;
        this.c = i2;
        this.d = i3;
        this.a = yui;
        this.p = new ArrayList();
        this.I = list;
        this.t = z3;
        this.S = this.a.a(context, 80, this.n);
        this.R = new znl();
        this.o = context.getResources().getInteger(R.integer.plus_audience_selection_num_suggested_image_columns);
        a((Object) null);
    }

    public final void b(ilh ilh) {
        if (ilh != null) {
            this.L = new yos(this, ilh);
            this.Q = new yot(this, ilh);
        } else {
            znl znl = new znl();
            this.Q = znl;
            this.L = znl;
        }
        this.v = !a() ? this.L : this.Q;
        g();
    }

    public final void c(ilh ilh) {
        this.p.clear();
        this.C = 0;
        this.F = true;
        this.G = ilh;
        int a2 = ilh.a();
        for (int i2 = 0; i2 < a2; i2++) {
            xfj xfj = (xfj) ilh.a(i2);
            String c2 = xfj.c();
            String a3 = xfj.a();
            if (!(c2 == null || a3 == null)) {
                this.p.add(ixa.a(xfj));
            }
        }
        this.C = this.p.size();
        this.y = a(false);
        g();
    }

    public static final boolean a(wzs wzs, wzs wzs2) {
        if (wzs == null && wzs2 == null) {
            return true;
        }
        if (wzs == null || wzs2 == null) {
            return false;
        }
        return wzs.c().equals(wzs2.c());
    }

    /* access modifiers changed from: protected */
    public View a(View view, ViewGroup viewGroup, boolean z2) {
        int i2;
        View a2 = a(view, R.layout.plus_audience_selection_list_loading);
        if (a2.findViewById(R.id.top_border) != null) {
            View findViewById = a2.findViewById(R.id.top_border);
            if (!z2) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            findViewById.setVisibility(i2);
        }
        a2.setClickable(true);
        a2.setFocusable(true);
        return a2;
    }

    /* access modifiers changed from: protected */
    public AudienceSelectionListCircleView a(wzs wzs, View view, ViewGroup viewGroup, boolean z2) {
        AudienceSelectionListCircleView audienceSelectionListCircleView = (AudienceSelectionListCircleView) a(view, R.layout.plus_audience_selection_list_circle);
        audienceSelectionListCircleView.a();
        audienceSelectionListCircleView.d = wzs;
        audienceSelectionListCircleView.a.setText(wzs.d());
        audienceSelectionListCircleView.b(z2);
        int g2 = wzs.g();
        if (g2 < 0) {
            audienceSelectionListCircleView.b();
        } else {
            audienceSelectionListCircleView.b.setVisibility(0);
            audienceSelectionListCircleView.b.setText(audienceSelectionListCircleView.getContext().getResources().getString(R.string.plus_circle_size_pattern, new Object[]{Integer.valueOf(g2)}));
        }
        audienceSelectionListCircleView.setChecked(this.l.a.b.contains(ixa.a(wzs)));
        audienceSelectionListCircleView.f = this;
        return audienceSelectionListCircleView;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: android.graphics.Bitmap} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.plus.audience.AudienceSelectionListPersonView a(java.lang.Object r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, boolean r19, int r20, android.view.View r21, boolean r22, boolean r23, boolean r24) {
        /*
            r12 = this;
            r6 = r12
            r0 = r17
            r1 = r24
            r2 = r20
            r3 = r21
            android.view.View r2 = r12.a(r3, r2)
            r7 = r2
            com.google.android.gms.plus.audience.AudienceSelectionListPersonView r7 = (com.google.android.gms.plus.audience.AudienceSelectionListPersonView) r7
            r8 = r23 ^ 1
            r7.a()
            r3 = r13
            r7.d = r3
            android.widget.TextView r2 = r7.a
            r4 = r14
            r2.setText(r14)
            r2 = r22
            r7.b(r2)
            r9 = 0
            r7.g = r9
            boolean r2 = android.text.TextUtils.isEmpty(r15)
            android.widget.TextView r4 = r7.b
            if (r4 != 0) goto L_0x002f
            goto L_0x0038
        L_0x002f:
            if (r2 != 0) goto L_0x0033
            r2 = 0
            goto L_0x0035
        L_0x0033:
            r2 = 8
        L_0x0035:
            r4.setVisibility(r2)
        L_0x0038:
            android.widget.TextView r2 = r7.b
            if (r2 == 0) goto L_0x0040
            r4 = r15
            r2.setText(r15)
        L_0x0040:
            r2 = r19
            r7.setChecked(r2)
            android.widget.CheckBox r2 = r7.e
            r2.setEnabled(r1)
            if (r1 != 0) goto L_0x004f
            r7.a(r9)
        L_0x004f:
            r7.f = r6
            boolean r1 = defpackage.ycm.i(r16)
            if (r1 == 0) goto L_0x0094
            boolean r0 = android.text.TextUtils.isEmpty(r18)
            if (r0 != 0) goto L_0x007d
            iqj r0 = r6.D
            r2 = r18
            java.lang.Object r0 = r0.a((java.lang.Object) r2)
            r10 = r0
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            if (r10 != 0) goto L_0x007c
            yol r11 = new yol
            r0 = r11
            r1 = r12
            r2 = r18
            r3 = r13
            r4 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Void[] r0 = new java.lang.Void[r9]
            r11.execute(r0)
            goto L_0x007e
        L_0x007c:
            goto L_0x007e
        L_0x007d:
            r10 = 0
        L_0x007e:
            if (r10 == 0) goto L_0x0084
            r12.a((com.google.android.gms.plus.audience.AudienceSelectionListPersonView) r7, (android.graphics.Bitmap) r10, (boolean) r8)
            goto L_0x00c9
        L_0x0084:
            if (r23 != 0) goto L_0x008d
            r0 = 2131231923(0x7f0804b3, float:1.807994E38)
            r7.a(r0)
            goto L_0x00c9
        L_0x008d:
            r0 = 2131231112(0x7f080188, float:1.8078296E38)
            r7.a(r0)
            goto L_0x00c9
        L_0x0094:
            if (r0 == 0) goto L_0x00c9
            iqj r1 = r6.D
            java.lang.Object r1 = r1.a((java.lang.Object) r0)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r1 == 0) goto L_0x00a4
            r12.a((com.google.android.gms.plus.audience.AudienceSelectionListPersonView) r7, (android.graphics.Bitmap) r1, (boolean) r8)
            goto L_0x00c9
        L_0x00a4:
            ibq r1 = defpackage.wlt.a
            icc r1 = r6.S
            r2 = 2
            r4 = 1
            icf r1 = defpackage.xdh.a(r1, r0, r2, r4)
            yom r2 = new yom
            r2.<init>(r1)
            r7.h = r2
            yon r2 = new yon
            r18 = r2
            r19 = r12
            r20 = r13
            r21 = r7
            r22 = r17
            r23 = r8
            r18.<init>(r19, r20, r21, r22, r23)
            r1.a((defpackage.icm) r2)
        L_0x00c9:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yoy.a(java.lang.Object, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, android.view.View, boolean, boolean, boolean):com.google.android.gms.plus.audience.AudienceSelectionListPersonView");
    }

    /* access modifiers changed from: protected */
    public final zni a(PeopleFeed peopleFeed, Cursor cursor) {
        yox yox;
        int i2;
        AudienceMember a2;
        List list;
        List list2 = this.H;
        if (list2 == null) {
            this.H = new ArrayList();
        } else {
            list2.clear();
        }
        HashSet hashSet = new HashSet();
        if (cursor != null) {
            cursor.moveToPosition(-1);
            while (cursor.moveToNext() && cursor.getPosition() < this.s) {
                String string = cursor.getString(3);
                if (!TextUtils.isEmpty(string)) {
                    String string2 = cursor.getString(2);
                    Uri lookupUri = ContactsContract.Contacts.getLookupUri(cursor.getLong(0), cursor.getString(1));
                    AudienceMember a3 = AudienceMember.a(string, string2);
                    a3.h.putString("contactsAvatarUri", lookupUri.toString());
                    if (!string.equals(string2)) {
                        a3.h.putString("secondaryText", string);
                    }
                    a3.h.putInt("contactType", 1);
                    this.H.add(a3);
                    hashSet.add(string2.toLowerCase());
                }
            }
        }
        if (peopleFeed != null) {
            List list3 = peopleFeed.d;
            for (int i3 = 0; i3 < list3.size(); i3++) {
                zhr zhr = (zhr) list3.get(i3);
                if (!hashSet.contains(zhr.b().toLowerCase()) && (a2 = a(zhr)) != null && ((list = this.I) == null || !list.contains(a2))) {
                    this.H.add(a2);
                }
            }
        }
        this.A = 0;
        this.B = 0;
        yoo yoo = null;
        if (this.H.size() <= 0) {
            return null;
        }
        int i4 = this.c;
        if (i4 <= 0 || (i2 = this.o) <= 0) {
            yox = null;
        } else {
            int min = Math.min(this.c, Math.max(1, i4 / i2) * this.o);
            this.A = min;
            int min2 = Math.min(min, this.H.size());
            this.A = min2;
            yox = new yox(this, this.H, min2);
        }
        if (this.d > 0 && this.A < this.H.size()) {
            int min3 = Math.min(this.d, this.H.size() - this.A);
            this.B = min3;
            List list4 = this.H;
            int i5 = this.A;
            yoo = new yoo(this, list4, i5, i5 + min3, 2);
        }
        return new znm(this, (int) R.string.plus_audience_selection_header_suggested, "★", (zni) new znh(yox, yoo));
    }

    /* access modifiers changed from: protected */
    public final zni a(boolean z2) {
        ArrayList arrayList = new ArrayList();
        int size = this.p.size();
        String str = null;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            String str2 = ((AudienceMember) this.p.get(i3)).f;
            if (str2 != null) {
                String substring = str2.length() <= 0 ? "" : str2.substring(0, 1);
                if (!substring.equalsIgnoreCase(str)) {
                    arrayList.add(new znm(this, str, (zni) new yoo(this, this.p, i2, i3, 0)));
                    str = substring.toUpperCase();
                    i2 = i3;
                }
            }
        }
        if (str != null) {
            List list = this.p;
            arrayList.add(new znm(this, str, (zni) new yoo(this, list, i2, list.size(), 0)));
        }
        znh znh = new znh((zni[]) arrayList.toArray(new zni[arrayList.size()]));
        if (!z2) {
            return znh;
        }
        return new znh(znh, this.J);
    }

    public final void a(AudienceSelectionListPersonView audienceSelectionListPersonView, Bitmap bitmap, boolean z2) {
        if (z2) {
            bitmap = jju.a(bitmap);
        }
        if (bitmap != null) {
            audienceSelectionListPersonView.c.setImageBitmap(bitmap);
        }
    }

    public final void a(PeopleFeed peopleFeed) {
        boolean z2 = true;
        this.F = true;
        List list = peopleFeed.d;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            AudienceMember a2 = a((zhr) list.get(i2));
            if (a2 != null) {
                this.p.add(a2);
            }
        }
        this.C = this.p.size();
        if (peopleFeed.e == null) {
            z2 = false;
        }
        this.y = a(z2);
        g();
    }

    public void a(ilh ilh) {
        if (ilh != null) {
            this.w = new yop(this, ilh);
        } else {
            this.w = new znl();
        }
        g();
    }

    public final void a(Object obj) {
        Audience audience;
        if (obj != this) {
            yqd yqd = this.l;
            if (yqd == null || (audience = yqd.a) == null) {
                String valueOf = String.valueOf(yqd);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 60);
                sb.append("Couldn't build audience blocks, unexpected selectionState = ");
                sb.append(valueOf);
                Log.e("AudienceSelectionAdapter", sb.toString());
                return;
            }
            for (AudienceMember audienceMember : audience.b) {
                if (audienceMember.c() && !this.T.containsKey(audienceMember.e)) {
                    this.F = true;
                    this.T.put(audienceMember.e, ixa.a(audienceMember));
                }
            }
            this.v = !a() ? this.L : this.Q;
            g();
            return;
        }
        notifyDataSetChanged();
    }

    public final void a(ypo ypo, boolean z2) {
        AudienceMember audienceMember;
        Audience audience;
        Object obj = ypo.d;
        if (obj instanceof xfj) {
            xfj xfj = (xfj) obj;
            audienceMember = ixa.a(xfj);
            int i2 = 3;
            if (ypo.g) {
                audienceMember.h.putInt("selectionSource", 3);
                audienceMember.h.putInt("contactType", 0);
            } else {
                audienceMember.h.putInt("selectionSource", 0);
                Bundle bundle = audienceMember.h;
                if (xfj.e().length > 0) {
                    i2 = 2;
                }
                bundle.putInt("contactType", i2);
            }
        } else if (obj instanceof wzs) {
            audienceMember = ixa.a((wzs) obj);
        } else if (obj instanceof AudienceMember) {
            audienceMember = (AudienceMember) obj;
        } else {
            return;
        }
        if (!z2) {
            audience = ixb.b(this.l.a, audienceMember);
        } else {
            audience = ixb.a(this.l.a, audienceMember);
        }
        this.l.a(audience, this);
    }
}
