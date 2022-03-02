package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.gms.location.reporting.UploadRequest;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: ajmo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajmo {
    public static final Object a = new Object();
    public final Context b;
    public final SharedPreferences c;
    private final Random d;

    public ajmo(Context context, SharedPreferences sharedPreferences, Random random) {
        int i;
        this.b = context;
        this.c = sharedPreferences;
        this.d = random;
        synchronized (a) {
            if (!this.c.getAll().isEmpty()) {
                i = 0;
            } else {
                i = 3;
            }
            int i2 = this.c.getInt("apiLevel", i);
            if (i2 < 2) {
                SharedPreferences.Editor edit = this.c.edit();
                edit.remove("lastPosition");
                edit.remove("lastActivityProcessedMillis");
                edit.remove("locationReportingIntentTimestamp");
                edit.remove("locationReportsSinceLastWifiAttached");
                edit.apply();
            }
            if (i2 < 3) {
                a();
            }
            this.c.edit().putInt("apiLevel", 3).apply();
        }
    }

    public static ajmo a(Context context) {
        ajnw.a(context);
        jhg.c();
        return new ajmo(context, context.getSharedPreferences("LOCATION_REPORTING", 0), new Random());
    }

    private static final String b(Collection collection) {
        aucd o = ajjt.b.o();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ajnb ajnb = (ajnb) it.next();
            aucd o2 = ajju.f.o();
            long j = ajnb.a;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            ajju ajju = (ajju) o2.b;
            int i = ajju.a | 1;
            ajju.a = i;
            ajju.b = j;
            long j2 = ajnb.b;
            ajju.a = i | 2;
            ajju.c = j2;
            UploadRequest uploadRequest = ajnb.c;
            aucd o3 = ajkc.j.o();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            ajkc ajkc = (ajkc) o3.b;
            ajkc.a |= 1;
            ajkc.b = 1;
            Account account = uploadRequest.a;
            if (account.name != null) {
                String str = account.name;
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                ajkc ajkc2 = (ajkc) o3.b;
                str.getClass();
                ajkc2.a = 2 | ajkc2.a;
                ajkc2.c = str;
            }
            if (account.type != null) {
                String str2 = account.type;
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                ajkc ajkc3 = (ajkc) o3.b;
                str2.getClass();
                ajkc3.a |= 4;
                ajkc3.d = str2;
            }
            String str3 = uploadRequest.b;
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            ajkc ajkc4 = (ajkc) o3.b;
            str3.getClass();
            int i2 = ajkc4.a | 8;
            ajkc4.a = i2;
            ajkc4.e = str3;
            long j3 = uploadRequest.c;
            int i3 = i2 | 16;
            ajkc4.a = i3;
            ajkc4.f = j3;
            long j4 = uploadRequest.d;
            int i4 = i3 | 32;
            ajkc4.a = i4;
            ajkc4.g = j4;
            long j5 = uploadRequest.e;
            int i5 = i4 | 64;
            ajkc4.a = i5;
            ajkc4.h = j5;
            String str4 = uploadRequest.f;
            if (str4 != null) {
                str4.getClass();
                ajkc4.a = i5 | 128;
                ajkc4.i = str4;
            }
            ajkc ajkc5 = (ajkc) o3.i();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            ajju ajju2 = (ajju) o2.b;
            ajkc5.getClass();
            ajju2.d = ajkc5;
            int i6 = ajju2.a | 4;
            ajju2.a = i6;
            String str5 = ajnb.d;
            if (str5 != null) {
                str5.getClass();
                ajju2.a = i6 | 8;
                ajju2.e = str5;
            }
            ajju ajju3 = (ajju) o2.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            ajjt ajjt = (ajjt) o.b;
            ajju3.getClass();
            if (!ajjt.a.a()) {
                ajjt.a = aucj.a(ajjt.a);
            }
            ajjt.a.add(ajju3);
        }
        return Base64.encodeToString(((ajjt) o.i()).k(), 2);
    }

    public final List c() {
        String string;
        String str;
        String str2;
        String str3;
        synchronized (a) {
            string = this.c.getString("uploadRequests", (String) null);
        }
        if (string == null) {
            return Collections.emptyList();
        }
        try {
            byte[] decode = Base64.decode(string, 2);
            aubs c2 = aubs.c();
            ArrayList arrayList = new ArrayList();
            for (ajju ajju : ((ajjt) aucj.a((aucj) ajjt.b, decode, c2)).a) {
                ajkc ajkc = ajju.d;
                if (ajkc == null) {
                    ajkc = ajkc.j;
                }
                int i = ajkc.a;
                if ((i & 2) != 0) {
                    str = ajkc.c;
                } else {
                    str = null;
                }
                if ((i & 4) != 0) {
                    str2 = ajkc.d;
                } else {
                    str2 = null;
                }
                Account account = new Account(str, str2);
                String str4 = ajkc.e;
                long j = ajkc.f;
                long j2 = ajkc.g;
                long j3 = ajkc.h;
                if ((ajkc.a & 128) != 0) {
                    str3 = ajkc.i;
                } else {
                    str3 = null;
                }
                arrayList.add(new ajnb(ajju.b, ajju.c, new UploadRequest(account, str4, j, j2, j3, str3), ajju.e));
            }
            return Collections.unmodifiableList(arrayList);
        } catch (auda | RuntimeException e) {
            ajix.b("GCoreUlr", string.length() == 0 ? new String("Can't parse upload request from: ") : "Can't parse upload request from: ".concat(string), e);
            this.c.edit().remove("uploadRequests").apply();
            return Collections.emptyList();
        }
    }

    public final boolean d() {
        return this.c.getBoolean("lastDeepStillModeValue", false);
    }

    public final String e() {
        return this.c.getString("homePlaceId", (String) null);
    }

    public final String f() {
        return this.c.getString("workPlaceId", (String) null);
    }

    public final ajnb a(UploadRequest uploadRequest, Long l, long j, String str) {
        ajnb ajnb;
        long j2 = uploadRequest.c;
        long E = aztb.E();
        if (j2 > E) {
            String valueOf = String.valueOf(uploadRequest);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
            sb.append(valueOf);
            sb.append(" duration too long; programming or deserialization error?");
            ajix.b("GCoreUlr", (Throwable) new AssertionError(sb.toString()));
            j2 = E;
        }
        long j3 = j + j2;
        synchronized (a) {
            ArrayList arrayList = new ArrayList(c());
            long j4 = l == null ? this.c.getLong("uploadRequestId", 0) + 1 : l.longValue();
            ajnb = new ajnb(j4, j3, uploadRequest, str);
            arrayList.add(ajnb);
            this.c.edit().putString("uploadRequests", b((Collection) arrayList)).putLong("uploadRequestId", j4).apply();
        }
        return ajnb;
    }

    public final void a() {
        SharedPreferences.Editor edit = this.c.edit();
        edit.remove("uploadRequests");
        edit.apply();
    }

    public final void a(long j) {
        this.c.edit().putLong("lastInferredPlacesRefreshTime", j).apply();
    }

    public final void a(String str) {
        if (str != null) {
            this.c.edit().putString("homePlaceId", str).apply();
        }
    }

    public final boolean a(Collection collection) {
        boolean removeAll;
        synchronized (a) {
            ob obVar = new ob();
            obVar.addAll(c());
            removeAll = obVar.removeAll(collection);
            this.c.edit().putString("uploadRequests", b((Collection) obVar)).apply();
        }
        return removeAll;
    }

    public final SecretKeySpec b() {
        long[] jArr;
        int i;
        synchronized (a) {
            jArr = new long[4];
            int i2 = 0;
            while (true) {
                if (i2 >= 4) {
                    break;
                }
                StringBuilder sb = new StringBuilder(25);
                sb.append("encryptionKey_");
                sb.append(i2);
                String sb2 = sb.toString();
                if (!this.c.contains(sb2)) {
                    jArr = null;
                    break;
                }
                jArr[i2] = this.c.getLong(sb2, 0);
                i2++;
            }
            if (jArr == null) {
                SharedPreferences.Editor edit = this.c.edit();
                long[] jArr2 = new long[4];
                for (int i3 = 0; i3 < 4; i3++) {
                    StringBuilder sb3 = new StringBuilder(25);
                    sb3.append("encryptionKey_");
                    sb3.append(i3);
                    String sb4 = sb3.toString();
                    long nextLong = this.d.nextLong();
                    jArr2[i3] = nextLong;
                    edit.putLong(sb4, nextLong);
                }
                edit.apply();
                jArr = jArr2;
            }
        }
        ByteBuffer allocate = ByteBuffer.allocate(32);
        for (i = 0; i < 4; i++) {
            allocate.putLong(jArr[i]);
        }
        return new SecretKeySpec(allocate.array(), "AES");
    }

    public final void b(String str) {
        if (str != null) {
            this.c.edit().putString("workPlaceId", str).apply();
        }
    }
}
