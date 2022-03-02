package defpackage;

import android.app.PendingIntent;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import com.google.android.gms.nearby.messages.internal.MessageWrapper;
import com.google.android.gms.nearby.messages.internal.Update;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: uyp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uyp {
    public final vcf a;
    public final PendingIntent b;
    public int c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public uyp(PendingIntent pendingIntent) {
        this((vcf) null, pendingIntent);
        iva.a((Object) pendingIntent);
    }

    private final boolean a(Context context, Intent intent) {
        int e;
        try {
            if (this.b != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    String a2 = vcr.a(this.b);
                    UsageStatsManager usageStatsManager = (UsageStatsManager) context.getSystemService("usagestats");
                    if (usageStatsManager != null && usageStatsManager.isAppInactive(a2) && (e = (int) aync.a.a().e()) > 0) {
                        usageStatsManager.whitelistAppTemporarily(a2, (long) e, Process.myUserHandle());
                    }
                }
                this.b.send(context, 0, intent);
                return true;
            }
        } catch (PendingIntent.CanceledException e2) {
            anih anih = (anih) tgc.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("uyp", "a", 197, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Tried sending %s, but client canceled PendingIntent.", (Object) "Subscription", (Object) intent.getExtras());
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uyp)) {
            return false;
        }
        uyp uyp = (uyp) obj;
        vcf vcf = this.a;
        vcf vcf2 = uyp.a;
        return (vcf == vcf2 || !(vcf == null || vcf2 == null || vcf.asBinder() != vcf2.asBinder())) && ius.a(this.b, uyp.b);
    }

    public final int hashCode() {
        IBinder iBinder;
        Object[] objArr = new Object[2];
        vcf vcf = this.a;
        if (vcf != null) {
            iBinder = vcf.asBinder();
        } else {
            iBinder = null;
        }
        objArr[0] = iBinder;
        objArr[1] = this.b;
        return Arrays.hashCode(objArr);
    }

    public final String toString() {
        String str;
        vcf vcf = this.a;
        if (vcf != null) {
            String valueOf = String.valueOf(vcf.asBinder());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("foreground MessageListener=");
            sb.append(valueOf);
            str = sb.toString();
        } else {
            String valueOf2 = String.valueOf(this.b);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 25);
            sb2.append("background PendingIntent=");
            sb2.append(valueOf2);
            str = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 23);
        sb3.append("Subscription.Listener{");
        sb3.append(str);
        sb3.append("}");
        return sb3.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public uyp(vcf vcf) {
        this(vcf, (PendingIntent) null);
        iva.a((Object) vcf);
    }

    private uyp(vcf vcf, PendingIntent pendingIntent) {
        this.c = 19;
        this.a = vcf;
        this.b = pendingIntent;
    }

    public final boolean a(Context context, Update update) {
        jjg jjg = tgc.a;
        if (this.a != null) {
            try {
                if (update.a(1)) {
                    this.a.a(MessageWrapper.a(update.c));
                }
                if (update.a(2)) {
                    this.a.b(MessageWrapper.a(update.c));
                }
                this.a.a(Collections.singletonList(update));
                return true;
            } catch (RemoteException e) {
                anih anih = (anih) tgc.a.b();
                anih.a((Throwable) e);
                ((anih) anih.a("uyp", "a", 121, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s RemoteException for callback: %s", (Object) "Subscription", (Object) update);
            } catch (Exception e2) {
                anih anih2 = (anih) tgc.a.b();
                anih2.a((Throwable) e2);
                ((anih) anih2.a("uyp", "a", 124, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Client code threw an exception in callback: %s", (Object) "Subscription", (Object) update);
            }
        } else {
            if (context != null) {
                if (!update.a(this.c)) {
                    return true;
                }
                if ((this.c ^ update.b) != 0) {
                    vdx vdx = new vdx();
                    vdx.b = update.c;
                    if (Update.a(this.c, 1) && update.a(1)) {
                        vdx.c();
                    }
                    if (Update.a(this.c, 2) && update.a(2)) {
                        vdx.d();
                    }
                    if (Update.a(this.c, 4) && update.a(4)) {
                        vdx.a(update.d);
                    }
                    if (Update.a(this.c, 8) && update.a(8)) {
                        vdx.a(update.e);
                    }
                    if (Update.a(this.c, 16) && update.a(16)) {
                        vdx.a(update.f);
                    }
                    if (Update.a(this.c, 32) && update.a(32)) {
                        vdx.a(update.g);
                    }
                    update = vdx.a();
                }
                Intent intent = new Intent();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(new Update[]{update}[0]);
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("com.google.android.gms.nearby.messages.UPDATES", arrayList);
                intent.putExtra("com.google.android.gms.nearby.messages.UPDATES", bundle);
                if (update.a(1)) {
                    vcr.a(intent, "com.google.android.gms.nearby.messages.MESSAGES", update.c);
                }
                if (update.a(2)) {
                    vcr.a(intent, "com.google.android.gms.nearby.messages.LOST_MESSAGE", update.c);
                }
                return a(context, intent);
            }
            return false;
        }
    }
}
