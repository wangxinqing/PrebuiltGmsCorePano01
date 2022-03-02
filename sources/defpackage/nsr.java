package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.gcm.GcmChimeraService;
import java.io.CharArrayWriter;
import java.io.PrintWriter;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: nsr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nsr extends bhw implements nss {
    private final Context a;
    private GcmChimeraService b;

    public nsr() {
        super("com.google.android.gms.gcm.IGcmServiceDiagnostics");
    }

    private final synchronized GcmChimeraService a() {
        if (this.b == null) {
            Context context = this.a;
            if (GcmChimeraService.a == null) {
                Context applicationContext = context.getApplicationContext();
                Intent intent = new Intent();
                intent.setClassName(applicationContext, "com.google.android.gms.gcm.GcmService");
                applicationContext.startService(intent);
                try {
                    GcmChimeraService.b.tryAcquire(2000, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            this.b = GcmChimeraService.a;
        }
        return this.b;
    }

    public final synchronized List b() {
        return GcmChimeraService.b();
    }

    public final synchronized String c() {
        String str;
        if (a() != null) {
            CharArrayWriter charArrayWriter = new CharArrayWriter();
            this.b.a(new PrintWriter(charArrayWriter));
            str = charArrayWriter.toString();
        } else {
            str = null;
        }
        return str;
    }

    public final synchronized String d() {
        if (a() == null) {
            return null;
        }
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        PrintWriter printWriter = new PrintWriter(charArrayWriter);
        GcmChimeraService gcmChimeraService = this.b;
        if (gcmChimeraService.e.i().a() == -1) {
            printWriter.println("Disabled");
        } else {
            printWriter.println(gcmChimeraService.e.c());
        }
        return charArrayWriter.toString();
    }

    public nsr(Context context) {
        super("com.google.android.gms.gcm.IGcmServiceDiagnostics");
        this.a = context.getApplicationContext();
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            List b2 = b();
            parcel2.writeNoException();
            parcel2.writeStringList(b2);
        } else if (i == 2) {
            String c = c();
            parcel2.writeNoException();
            parcel2.writeString(c);
        } else if (i != 3) {
            return false;
        } else {
            String d = d();
            parcel2.writeNoException();
            parcel2.writeString(d);
        }
        return true;
    }
}
