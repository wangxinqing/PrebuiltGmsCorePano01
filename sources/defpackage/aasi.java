package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.UUID;

/* renamed from: aasi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aasi extends nis {
    private final zzw a;
    private final String b;

    static {
        aasi.class.getSimpleName();
    }

    public aasi(zzw zzw, String str) {
        super(45, "id");
        this.a = zzw;
        this.b = str;
    }

    public static synchronized boolean b(Context context) {
        boolean z;
        synchronized (aasi.class) {
            aarq aarq = new aarq(context);
            int R = (int) azfv.a.a().R();
            if (R != aarq.a.getInt("snet_shared_uuid_reset_counter", -1)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                aarq.a("snet_shared_uuid_reset_counter", R);
            }
        }
        return z;
    }

    public static synchronized String c(Context context) {
        String string;
        synchronized (aasi.class) {
            string = new aarq(context).a.getString("snet_shared_uuid", "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa");
        }
        return string;
    }

    public static synchronized String d(Context context) {
        String uuid;
        synchronized (aasi.class) {
            uuid = UUID.randomUUID().toString();
            new aarq(context).a("snet_shared_uuid", uuid);
        }
        return uuid;
    }

    public final void a(Context context) {
        String str;
        if (aann.c(context, this.b)) {
            if (!b(context)) {
                str = c(context);
            } else {
                str = "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa";
            }
            if (TextUtils.isEmpty(str) || "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa".equals(str)) {
                str = d(context);
            }
            zzw zzw = this.a;
            if (zzw != null) {
                zzw.a(str);
                return;
            }
            return;
        }
        zzw zzw2 = this.a;
        if (zzw2 != null) {
            zzw2.a("aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa");
        }
    }

    public final void a(Status status) {
        zzw zzw = this.a;
        if (zzw != null) {
            zzw.a((String) null);
        }
    }
}
