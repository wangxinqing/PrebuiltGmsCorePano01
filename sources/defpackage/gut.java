package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.Surface;
import com.google.android.gms.cast_mirroring.JGCastService;
import java.util.Locale;
import java.util.NoSuchElementException;

/* renamed from: gut  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gut extends guv implements biy, niz {
    private final Context a;
    private IBinder.DeathRecipient b = new gus(this);
    private JGCastService c;
    private guu d;

    public gut(Context context) {
        this.a = context;
    }

    public final void a() {
        JGCastService jGCastService = this.c;
        if (jGCastService != null) {
            if (jGCastService.mDidLoadLibrary) {
                jGCastService.native_disconnect();
            }
            this.c = null;
        }
    }

    public final void b() {
        a();
        guu guu = this.d;
        if (guu != null) {
            try {
                guu.a.unlinkToDeath(this.b, 0);
            } catch (NoSuchElementException e) {
            } finally {
                this.d = null;
                this.b = null;
            }
        }
    }

    public final void c() {
        throw new UnsupportedOperationException("Service does not support this.");
    }

    public final void d() {
        throw new UnsupportedOperationException("Service does not support this.");
    }

    public final void e() {
        throw new UnsupportedOperationException("Service does not support this.");
    }

    public final void f() {
        throw new UnsupportedOperationException("Service does not support this.");
    }

    public final void a(int i, int i2) {
        if (i == 1) {
            guu guu = this.d;
            if (guu != null) {
                Parcel aQ = guu.aQ();
                aQ.writeInt(i2);
                guu.c(2, aQ);
            }
        } else if (i == 2) {
            guu guu2 = this.d;
            if (guu2 != null) {
                guu2.c(1, guu2.aQ());
            }
        } else if (i == 3) {
            try {
                JGCastService jGCastService = this.c;
                if (jGCastService != null) {
                    if (jGCastService.mDidLoadLibrary) {
                        jGCastService.native_release();
                    }
                    this.c = null;
                }
                guu guu3 = this.d;
                if (guu3 != null) {
                    guu3.c(3, guu3.aQ());
                    this.d = null;
                }
            } catch (RemoteException e) {
                Log.w("CastMirroringSrvcStub", "client died - unable to notify.");
            } catch (IllegalStateException e2) {
                Log.w("CastMirroringSrvcStub", "client already disconnected - unable to notify.");
            }
        }
    }

    public final void a(guu guu, boolean z, String str, Surface surface, int i) {
        int i2;
        iva.a((Object) guu);
        if (!z) {
            this.d = guu;
            try {
                guu.a.linkToDeath(this.b, 0);
                this.c = new JGCastService(this.a, this);
                int indexOf = str.indexOf(58);
                String substring = str.substring(0, indexOf);
                String substring2 = str.substring(indexOf + 1);
                int a2 = (int) awrb.a.a().a();
                if ((i & 1) == 0) {
                    i2 = a2;
                } else {
                    i2 = a2 | Integer.MIN_VALUE;
                }
                Log.w("CastMirroringSrvcStub", String.format(Locale.ROOT, "createSourceOrSink, flags = 0x%x", new Object[]{Integer.valueOf(i)}));
                JGCastService jGCastService = this.c;
                if (jGCastService.mDidLoadLibrary) {
                    if (com.google.android.cast.JGCastService.DEBUG) {
                        "createSourceOrSink createSource=false, localInterface=0.0.0.0, remoteHost=" + substring + ", jsonConfig=" + substring2 + ", flags=" + i2;
                    }
                    jGCastService.native_createSourceOrSink(false, "0.0.0.0", substring, substring2, surface, i2);
                }
            } catch (RemoteException e) {
                Log.e("CastMirroringSrvcStub", "unable to link cast mirroring reaper");
                a();
            }
        } else {
            throw new IllegalArgumentException("creating source not supported");
        }
    }

    public final void a(boolean z, String str) {
        JGCastService jGCastService = this.c;
        if (jGCastService == null) {
            Log.w("CastMirroringSrvcStub", "setParameters() without active native service!");
        } else if (jGCastService.mDidLoadLibrary) {
            if (com.google.android.cast.JGCastService.DEBUG) {
                "setParameters source=" + z + ", params=" + str;
            }
            jGCastService.native_setParameters(z, str);
        }
    }
}
