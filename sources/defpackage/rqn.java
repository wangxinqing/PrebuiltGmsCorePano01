package defpackage;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;

/* renamed from: rqn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rqn {
    public final rsi a;
    private rqw b;

    public rqn(rsi rsi) {
        iva.a((Object) rsi);
        this.a = rsi;
    }

    public final CameraPosition a() {
        try {
            return this.a.b();
        } catch (RemoteException e) {
            throw new rvl(e);
        }
    }

    @Deprecated
    public final Location c() {
        try {
            return this.a.d();
        } catch (RemoteException e) {
            throw new rvl(e);
        }
    }

    public final rqw d() {
        try {
            if (this.b == null) {
                this.b = new rqw(this.a.e());
            }
            return this.b;
        } catch (RemoteException e) {
            throw new rvl(e);
        }
    }

    public final rqt e() {
        try {
            return new rqt(this.a.f());
        } catch (RemoteException e) {
            throw new rvl(e);
        }
    }

    public final void b() {
        try {
            this.a.c();
        } catch (RemoteException e) {
            throw new rvl(e);
        }
    }

    public final rvb a(GroundOverlayOptions groundOverlayOptions) {
        try {
            rwa a2 = this.a.a(groundOverlayOptions);
            if (a2 != null) {
                return new rvb(a2);
            }
            return null;
        } catch (RemoteException e) {
            throw new rvl(e);
        }
    }

    public final void b(rqh rqh) {
        try {
            this.a.b(rqh.a);
        } catch (RemoteException e) {
            throw new rvl(e);
        }
    }

    public final rvg a(MarkerOptions markerOptions) {
        try {
            rwg a2 = this.a.a(markerOptions);
            if (a2 != null) {
                return new rvg(a2);
            }
            return null;
        } catch (RemoteException e) {
            throw new rvl(e);
        }
    }

    @Deprecated
    public final void a(akyw akyw) {
        if (akyw != null) {
            try {
                this.a.a((rua) new rtz(akyw));
            } catch (RemoteException e) {
                throw new rvl(e);
            }
        } else {
            this.a.a((rua) null);
        }
    }

    public final void a(rqh rqh) {
        try {
            this.a.a(rqh.a);
        } catch (RemoteException e) {
            throw new rvl(e);
        }
    }

    @Deprecated
    public final void a(rqk rqk) {
        if (rqk != null) {
            try {
                this.a.a((rsv) new rsu(rqk));
            } catch (RemoteException e) {
                throw new rvl(e);
            }
        } else {
            this.a.a((rsv) null);
        }
    }

    public final void a(rql rql) {
        if (rql != null) {
            try {
                this.a.a((rtn) new rtm(rql));
            } catch (RemoteException e) {
                throw new rvl(e);
            }
        } else {
            this.a.a((rtn) null);
        }
    }

    public final void a(rqm rqm) {
        if (rqm != null) {
            try {
                this.a.a((rtv) new rtu(rqm));
            } catch (RemoteException e) {
                throw new rvl(e);
            }
        } else {
            this.a.a((rtv) null);
        }
    }

    public final void a(boolean z) {
        try {
            this.a.a(z);
        } catch (RemoteException e) {
            throw new rvl(e);
        }
    }
}
