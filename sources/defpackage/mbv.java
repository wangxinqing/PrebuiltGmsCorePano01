package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.maps.GoogleMapOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: mbv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mbv {
    public Bundle a;
    public LinkedList b;
    public rqq c;
    public final List d;
    protected mbq e;
    private final mbq f;
    private final ViewGroup g;
    private final Context h;
    private final GoogleMapOptions i;

    public mbv() {
        this.f = new mbq(this);
    }

    public final void a(int i2) {
        while (!this.b.isEmpty() && ((mbu) this.b.getLast()).a() >= i2) {
            this.b.removeLast();
        }
    }

    public final void a(Bundle bundle, mbu mbu) {
        if (this.c == null) {
            if (this.b == null) {
                this.b = new LinkedList();
            }
            this.b.add(mbu);
            if (bundle != null) {
                Bundle bundle2 = this.a;
                if (bundle2 == null) {
                    this.a = (Bundle) bundle.clone();
                } else {
                    bundle2.putAll(bundle);
                }
            }
            mbq mbq = this.f;
            this.e = mbq;
            if (mbq != null && this.c == null) {
                try {
                    rqr.a(this.h);
                    rss newMapViewDelegate = ruu.a(this.h).newMapViewDelegate(mbz.a((Object) this.h), this.i);
                    if (newMapViewDelegate != null) {
                        mbq mbq2 = this.e;
                        rqq rqq = new rqq(this.g, newMapViewDelegate);
                        mbv mbv = mbq2.a;
                        mbv.c = rqq;
                        Iterator it = mbv.b.iterator();
                        while (it.hasNext()) {
                            ((mbu) it.next()).b();
                        }
                        mbq2.a.b.clear();
                        mbq2.a.a = null;
                        for (rqs a2 : this.d) {
                            this.c.a(a2);
                        }
                        this.d.clear();
                    }
                } catch (RemoteException e2) {
                    throw new rvl(e2);
                } catch (hxw e3) {
                }
            }
        } else {
            mbu.b();
        }
    }

    public mbv(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.f = new mbq(this);
        this.d = new ArrayList();
        this.g = viewGroup;
        this.h = context;
        this.i = googleMapOptions;
    }
}
