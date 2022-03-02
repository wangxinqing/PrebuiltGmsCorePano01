package defpackage;

import android.content.ContentValues;
import android.content.res.Resources;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: wrj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wrj implements wri {
    private final wqv a;

    static {
        int i = wqi.a;
    }

    public wrj(wqv wqv) {
        this.a = wqv;
    }

    /* JADX INFO: finally extract failed */
    public final wqy a(Resources resources, long j, long j2) {
        Pair pair;
        Resources resources2 = resources;
        long j3 = j;
        xip.a();
        HashSet hashSet = new HashSet();
        long j4 = 0;
        if (j3 <= 0) {
            String valueOf = String.valueOf(Integer.valueOf((int) aywy.a.a().l()));
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("times_contacted DESC LIMIT ");
            sb.append(valueOf);
            pair = this.a.a(resources2, "", sb.toString());
            if (Boolean.valueOf(aywy.a.a().x()).booleanValue()) {
                this.a.a(j2 == 0 ? System.currentTimeMillis() - TimeUnit.DAYS.toMillis((long) Integer.valueOf((int) aywy.a.a().w()).intValue()) : j2, hashSet);
            }
        } else {
            String valueOf2 = String.valueOf(Integer.valueOf((int) aywy.a.a().ai()));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 12);
            sb2.append(" DESC LIMIT ");
            sb2.append(valueOf2);
            String sb3 = sb2.toString();
            wqv wqv = this.a;
            String valueOf3 = String.valueOf(sb3);
            String str = valueOf3.length() == 0 ? new String("contact_last_updated_timestamp") : "contact_last_updated_timestamp".concat(valueOf3);
            iva.a(true);
            StringBuilder sb4 = new StringBuilder(51);
            sb4.append("contact_last_updated_timestamp>");
            sb4.append(j3);
            pair = wqv.a(resources2, sb4.toString(), str);
            if (!Boolean.valueOf(aywy.a.a().ah()).booleanValue()) {
                this.a.a(j3, hashSet);
            } else {
                String valueOf4 = String.valueOf(Integer.valueOf((int) aywy.a.a().ag()));
                StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf4).length() + 12);
                sb5.append(" DESC LIMIT ");
                sb5.append(valueOf4);
                String sb6 = sb5.toString();
                wqv wqv2 = this.a;
                String valueOf5 = String.valueOf(sb6);
                wqv2.a(j3, (Set) hashSet, valueOf5.length() == 0 ? new String("contact_deleted_timestamp") : "contact_deleted_timestamp".concat(valueOf5));
            }
        }
        wqk wqk = (wqk) pair.first;
        ArrayList arrayList = new ArrayList();
        while (wqk.hasNext()) {
            try {
                wqj wqj = (wqj) wqk.next();
                ContentValues contentValues = wqj.a;
                if (wqm.a(contentValues) == j4) {
                    j4 = 0;
                } else if (contentValues.get("lookup_key") == null) {
                    j4 = 0;
                } else if (contentValues.get("display_name") != null) {
                    long a2 = wqm.a(contentValues);
                    ContentValues contentValues2 = wqj.a;
                    wrn wrn = new wrn(contentValues2.getAsLong("contact_id").longValue(), contentValues2.getAsString("display_name"));
                    wrn.i.add(contentValues2.getAsString("nickname"));
                    wrn.f = (double) contentValues2.getAsInteger("score").intValue();
                    ContentValues contentValues3 = wqj.b;
                    wrn.g = contentValues3.getAsLong("TIMES_CONTACTED").longValue();
                    wrn.h = contentValues3.getAsLong("LAST_TIME_CONTACTED").longValue();
                    ArrayList arrayList2 = new ArrayList();
                    for (ContentValues contentValues4 : wqj.c.values()) {
                        arrayList2.add(new wqx(contentValues4.getAsString("email"), contentValues4.getAsString("label")));
                    }
                    wrn.d.clear();
                    wrn.d.addAll(arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    for (ContentValues contentValues5 : wqj.d.values()) {
                        arrayList3.add(new wqx(contentValues5.getAsString("phone"), contentValues5.getAsString("label")));
                    }
                    wrn.c.clear();
                    wrn.c.addAll(arrayList3);
                    ArrayList arrayList4 = new ArrayList();
                    for (ContentValues contentValues6 : wqj.e.values()) {
                        arrayList4.add(new wqx(contentValues6.getAsString("postal"), contentValues6.getAsString("label")));
                    }
                    wrn.e.clear();
                    wrn.e.addAll(arrayList4);
                    arrayList.add(wrn);
                    hashSet.remove(Long.valueOf(a2));
                    j4 = 0;
                } else {
                    j4 = 0;
                }
            } catch (Throwable th) {
                wqk.a();
                throw th;
            }
        }
        wqk.a();
        if (wqk.b()) {
            return new wqy(arrayList, hashSet);
        }
        return null;
    }
}
