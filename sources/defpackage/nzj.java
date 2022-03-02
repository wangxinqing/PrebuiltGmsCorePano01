package defpackage;

import android.os.AsyncTask;
import java.util.List;

/* renamed from: nzj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class nzj extends AsyncTask {
    protected final oat a;
    public boolean b;
    public boolean c = false;
    public Object d = null;

    public nzj(oat oat) {
        this.a = oat;
    }

    public static void a(boolean z, List list) {
        int size = list.size();
        int size2 = list.size();
        nzj[] nzjArr = new nzj[size2];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            nzj nzj = (nzj) list.get(i3);
            if (!z || nzj.b()) {
                nzjArr[i2] = nzj;
                i2++;
            }
        }
        while (i < size2) {
            nzj nzj2 = nzjArr[i];
            if (nzj2 != null) {
                nzj2.c();
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a() {
    }

    /* access modifiers changed from: protected */
    public void b(Object obj) {
    }

    public boolean b() {
        return false;
    }

    public final void c() {
        try {
            cancel(false);
        } finally {
            this.a.b(this);
        }
    }

    /* access modifiers changed from: protected */
    public final void onPostExecute(Object obj) {
        if (this.c) {
            this.d = obj;
        } else {
            a(obj);
        }
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        this.a.a(this);
        a();
    }

    public final void a(Object obj) {
        try {
            this.b = true;
            b(obj);
        } finally {
            this.a.b(this);
        }
    }
}
