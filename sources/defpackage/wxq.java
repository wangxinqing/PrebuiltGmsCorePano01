package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: wxq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wxq extends wlp implements xaf, wwr {
    private final WeakReference A;
    private idf B;
    private Status C;
    private boolean D;
    private boolean E;
    private Status F;
    public final wwl a;
    public final Object[] b;
    public final Set c = new HashSet();
    public Context m;
    public ArrayList n;
    public DataHolder o;
    public DataHolder p;
    public DataHolder q;
    public DataHolder r;
    public DataHolder s;
    public DataHolder t;
    public DataHolder u;
    public DataHolder v;
    public DataHolder w;
    public wvz[] x;
    private final wvw y;
    private final String[] z;

    public wxq(icc icc, wvw wvw, wwl wwl, String[] strArr) {
        super(icc);
        int i = 0;
        this.D = false;
        this.E = false;
        this.A = new WeakReference(icc);
        this.y = wvw;
        this.a = wwl;
        this.B = this;
        this.z = strArr;
        this.b = new Object[strArr.length];
        while (true) {
            Object[] objArr = this.b;
            if (i < objArr.length) {
                objArr[i] = new Object();
                i++;
            } else {
                return;
            }
        }
    }

    private final void a(DataHolder dataHolder) {
        Set<String> set;
        int length = this.z.length;
        Set[] setArr = new Set[length];
        for (int i = 0; i < length; i++) {
            HashSet hashSet = new HashSet();
            setArr[i] = hashSet;
            hashSet.add(this.z[i]);
        }
        if (dataHolder != null) {
            HashMap hashMap = new HashMap();
            for (int i2 = 0; i2 < dataHolder.h; i2++) {
                int a2 = dataHolder.a(i2);
                String c2 = dataHolder.c("gaia_id", i2, a2);
                String c3 = dataHolder.c("contact_id", i2, a2);
                Set set2 = (Set) hashMap.get(c2);
                if (set2 == null) {
                    set2 = new HashSet();
                    hashMap.put(c2, set2);
                }
                set2.add(c3);
            }
            for (int i3 = 0; i3 < length; i3++) {
                if (ycm.j(this.z[i3]) && (set = (Set) hashMap.get(ycm.e(this.z[i3]))) != null) {
                    for (String g : set) {
                        setArr[i3].add(wxh.g(g));
                    }
                }
            }
        }
        new Thread(new wwt(this, this.m, this.y.a.a, setArr)).start();
    }

    private final void f() {
        Status status;
        boolean z2;
        icm icm;
        if (this.B != null) {
            wvw wvw = this.y;
            if (wvw.d && this.F == null) {
                status = new Status(100);
            } else {
                boolean z3 = wvw.c;
                if (!wvw.b) {
                    status = Status.a;
                } else {
                    status = !this.D ? new Status(100) : this.C;
                }
            }
            boolean z4 = true;
            if (status.i != 100) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.F == null) {
                z4 = false;
            }
            idf idf = this.B;
            icc icc = (icc) this.A.get();
            wxn wxn = null;
            if (!z2 && icc != null) {
                wxn = new wxn(wlt.a, icc);
                try {
                    icc.b((idf) wxn);
                } catch (IllegalStateException e) {
                    Log.e("PeopleClient", "Client disconnected unexpectedly!", e);
                }
            }
            this.B = wxn;
            wxo wxo = new wxo(this, wxn);
            idf idf2 = this.B;
            if (!(idf2 == null || (icm = this.y.e) == null)) {
                idf2.a(icm);
            }
            idf.a((icl) new wxp(status, wxo, z2, z4));
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ icl b(Status status) {
        return wxx.a(status);
    }

    public final synchronized void a(int i, Bundle bundle) {
        try {
            bundle.setClassLoader(getClass().getClassLoader());
            this.C = new Status(i);
            this.n = bundle.getParcelableArrayList("get.server_blob");
            this.D = bundle.getBoolean("response_complete");
            DataHolder dataHolder = (DataHolder) bundle.getParcelable("gaia_map");
            boolean z2 = true;
            if (dataHolder != null) {
                if (this.y.d) {
                    if (!this.E) {
                        this.E = true;
                        a(dataHolder);
                    }
                }
                this.c.add(dataHolder);
            }
            Bundle bundle2 = bundle.getBundle("db");
            if (bundle2 != null) {
                for (String parcelable : bundle2.keySet()) {
                    this.c.add((DataHolder) bundle2.getParcelable(parcelable));
                }
                this.o = (DataHolder) bundle2.getParcelable("people");
                this.p = (DataHolder) bundle2.getParcelable("people_address");
                this.q = (DataHolder) bundle2.getParcelable("people_email");
                this.r = (DataHolder) bundle2.getParcelable("people_phone");
                this.s = (DataHolder) bundle2.getParcelable("owner");
                this.t = (DataHolder) bundle2.getParcelable("owner_address");
                this.u = (DataHolder) bundle2.getParcelable("owner_email");
                this.v = (DataHolder) bundle2.getParcelable("owner_phone");
                this.w = (DataHolder) bundle2.getParcelable("circles");
            }
            ArrayList arrayList = this.n;
            if (arrayList != null) {
                if (this.b.length != arrayList.size()) {
                    z2 = false;
                }
                iva.a(z2);
            }
            f();
        } catch (Exception e) {
            Log.w("PeopleClient", "GetById callback error.", e);
            throw e;
        }
    }

    public final synchronized void a(Status status, wvz[] wvzArr) {
        boolean z2;
        try {
            this.F = status;
            this.x = wvzArr;
            if (wvzArr != null) {
                if (this.b.length == wvzArr.length) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                iva.a(z2);
            }
            f();
        } catch (Exception e) {
            Log.w("PeopleClient", "GetById CP2 callback error.", e);
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        xbi xbi = (xbi) ibf;
        this.m = xbi.c;
        wvw wvw = this.y;
        if (wvw.a.a != null) {
            xbi.a((xaf) this, wvw, this.z);
            return;
        }
        this.D = true;
        if (!wvw.b) {
            boolean z2 = wvw.c;
            this.C = Status.a;
        } else {
            this.C = Status.c;
        }
        a((DataHolder) null);
    }
}
