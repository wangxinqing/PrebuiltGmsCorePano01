package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.drive.events.DriveEvent;
import com.google.android.gms.drive.internal.OnEventResponse;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ktc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ktc implements IBinder.DeathRecipient {
    private static final ith a = new ith("PackageEventRouter", "");
    private final Context b;
    private final String c;
    private IBinder d;
    private ServiceConnection e;
    private kwj f;
    private final List g = new ArrayList();

    public ktc(Context context, String str) {
        this.b = context;
        this.c = str;
        a.a("Starting new event router for %s", str);
        d();
    }

    private final synchronized void b(DriveEvent driveEvent) {
        iva.a((Object) this.f);
        try {
            this.f.a(new OnEventResponse(driveEvent));
            a.b("Event sent OK.");
        } catch (RemoteException e2) {
            a.c("PackageEventRouter", "Could not send event", e2);
            new Object[1][0] = driveEvent;
        }
    }

    private final synchronized void d() {
        a.a("Connecting event router to %s", this.c);
        Intent a2 = ksr.a(this.c);
        this.e = new ktb("drive", this);
        jca.a().a(this.b, a2, this.e, 1);
    }

    public final synchronized void a(IBinder iBinder) {
        kwj kwj;
        a.a("Connected to event service for %s", this.c);
        try {
            this.d = iBinder;
            iBinder.linkToDeath(this, 0);
        } catch (RemoteException e2) {
            a.b("PackageEventRouter", "Unable to link to event service death", (Throwable) e2);
        }
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.internal.IEventCallback");
            kwj = queryLocalInterface instanceof kwj ? (kwj) queryLocalInterface : new kwh(iBinder);
        } else {
            kwj = null;
        }
        this.f = kwj;
        List list = this.g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            b((DriveEvent) list.get(i));
        }
        this.g.clear();
    }

    public final synchronized void binderDied() {
        IBinder iBinder = this.d;
        if (iBinder != null) {
            iBinder.unlinkToDeath(this, 0);
            c();
        }
    }

    public final synchronized void c() {
        this.d = null;
        this.e = null;
        this.f = null;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b() {
        a.a("Stopping event router for %s", this.c);
        if (this.e != null) {
            jca.a().a(this.b, this.e);
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(DriveEvent driveEvent) {
        if (this.f == null) {
            this.g.add(driveEvent);
        } else {
            b(driveEvent);
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean a() {
        if (!this.g.isEmpty()) {
            return false;
        }
        a.a("Stopping idle event router for %s", this.c);
        b();
        return true;
    }
}
