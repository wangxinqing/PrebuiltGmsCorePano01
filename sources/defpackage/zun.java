package defpackage;

import android.content.ContentValues;
import android.content.res.Resources;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: zun  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zun implements zum {
    private static final boolean b = true;
    private final zux a;

    static {
        zsg.a("ContactsLoggerHelper");
        int i = ztz.a;
    }

    public zun(zux zux) {
        this.a = zux;
    }

    /* JADX INFO: finally extract failed */
    public final ztm a(Resources resources, long j, long j2) {
        Pair pair;
        Resources resources2 = resources;
        long j3 = j;
        HashSet hashSet = new HashSet();
        long j4 = 0;
        if (j3 <= 0) {
            long c = azdq.a.a().c();
            StringBuilder sb = new StringBuilder(61);
            sb.append("starred DESC, times_contacted DESC LIMIT ");
            sb.append(c);
            pair = this.a.a(resources2, "", sb.toString());
            if (azdq.a.a().v() && b) {
                this.a.a(j2 == 0 ? System.currentTimeMillis() - TimeUnit.DAYS.toMillis(azdq.n()) : j2, hashSet);
            }
        } else if (!b) {
            return null;
        } else {
            long B = azdq.a.a().B();
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(" DESC LIMIT ");
            sb2.append(B);
            String sb3 = sb2.toString();
            zux zux = this.a;
            String valueOf = String.valueOf(sb3);
            String str = valueOf.length() == 0 ? new String("contact_last_updated_timestamp") : "contact_last_updated_timestamp".concat(valueOf);
            iva.a(zux.b);
            StringBuilder sb4 = new StringBuilder(51);
            sb4.append("contact_last_updated_timestamp>");
            sb4.append(j3);
            pair = zux.a(resources2, sb4.toString(), str);
            if (azdq.a.a().A()) {
                long z = azdq.a.a().z();
                StringBuilder sb5 = new StringBuilder(32);
                sb5.append(" DESC LIMIT ");
                sb5.append(z);
                String sb6 = sb5.toString();
                zux zux2 = this.a;
                String valueOf2 = String.valueOf(sb6);
                zux2.a(j3, (Set) hashSet, valueOf2.length() == 0 ? new String("contact_deleted_timestamp") : "contact_deleted_timestamp".concat(valueOf2));
            } else {
                this.a.a(j3, hashSet);
            }
        }
        zub zub = (zub) pair.first;
        ArrayList arrayList = new ArrayList();
        while (zub.hasNext()) {
            try {
                zua zua = (zua) zub.next();
                ContentValues contentValues = zua.a;
                if (zud.a(contentValues) == j4) {
                    j4 = 0;
                } else if (contentValues.get("lookup_key") == null) {
                    j4 = 0;
                } else if (contentValues.get("display_name") != null) {
                    long a2 = zud.a(contentValues);
                    ContentValues contentValues2 = zua.a;
                    zvb zvb = new zvb(contentValues2.getAsLong("contact_id").longValue(), contentValues2.getAsString("display_name"));
                    zvb.i.add(contentValues2.getAsString("nickname"));
                    zvb.f = (double) contentValues2.getAsInteger("score").intValue();
                    if (!azdq.e()) {
                        ContentValues contentValues3 = zua.b;
                        zvb.g = contentValues3.getAsLong("TIMES_CONTACTED").longValue();
                        zvb.h = contentValues3.getAsLong("LAST_TIME_CONTACTED").longValue();
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (ContentValues contentValues4 : zua.c.values()) {
                        arrayList2.add(new ztl(contentValues4.getAsString("email"), contentValues4.getAsString("label")));
                    }
                    zvb.d.clear();
                    zvb.d.addAll(arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    for (ContentValues contentValues5 : zua.d.values()) {
                        arrayList3.add(new ztl(contentValues5.getAsString("phone"), contentValues5.getAsString("label")));
                    }
                    zvb.c.clear();
                    zvb.c.addAll(arrayList3);
                    ArrayList arrayList4 = new ArrayList();
                    for (ContentValues contentValues6 : zua.e.values()) {
                        arrayList4.add(new ztl(contentValues6.getAsString("postal"), contentValues6.getAsString("label")));
                    }
                    zvb.e.clear();
                    zvb.e.addAll(arrayList4);
                    arrayList.add(zvb);
                    hashSet.remove(Long.valueOf(a2));
                    j4 = 0;
                } else {
                    j4 = 0;
                }
            } catch (Throwable th) {
                zub.a();
                throw th;
            }
        }
        zub.a();
        if (zub.b()) {
            return new ztm(arrayList, hashSet);
        }
        return null;
    }
}
