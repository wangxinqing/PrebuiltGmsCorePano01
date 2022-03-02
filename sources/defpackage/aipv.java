package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.location.NetworkLocationStatus;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: aipv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aipv {
    public final HashMap a = new HashMap(1);
    public final jkl b = new jkl();
    public aicn c = null;
    public long d = Long.MAX_VALUE;
    public long e = Long.MAX_VALUE;
    public long f = Long.MAX_VALUE;
    public boolean g = false;
    public ajrb h = new ajrc();
    aiay i = null;

    private static int a(int i2) {
        if (i2 == 0) {
            return 0;
        }
        switch (i2) {
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 9;
            default:
                return 1;
        }
    }

    public static final Intent a() {
        Intent intent = new Intent();
        intent.putExtra("com.google.android.location.internal.EXTRA_RELEASE_VERSION", 2023);
        return intent;
    }

    /* access modifiers changed from: package-private */
    public final void a(Context context, boolean z) {
        Iterator it = this.a.values().iterator();
        boolean z2 = false;
        Intent intent = null;
        while (it.hasNext()) {
            if (intent == null) {
                intent = a();
                intent.putExtra("providerEnabled", z);
            }
            aipz aipz = (aipz) it.next();
            if (!aipz.a(context, intent)) {
                String valueOf = String.valueOf(aipz);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb.append("dropping intent receiver");
                sb.append(valueOf);
                sb.toString();
                aicn aicn = this.c;
                if (aicn != null) {
                    aicn.a(aico.LOCATION_PENDING_INTENT_DROPPED, aipz.h.hashCode(), aipz.h.getTargetPackage());
                }
                it.remove();
                z2 = true;
            }
        }
        if (z2) {
            a(this.a.values());
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Context context, aiay[] aiayArr) {
        aiay[] aiayArr2 = aiayArr;
        this.i = aiayArr2[aiayArr2.length - 1];
        Iterator it = this.a.values().iterator();
        Intent intent = null;
        boolean z = false;
        while (it.hasNext()) {
            aipt aipt = (aipt) it.next();
            if (intent == null) {
                intent = a();
                NetworkLocationStatus[] networkLocationStatusArr = new NetworkLocationStatus[aiayArr2.length];
                for (int i2 = 0; i2 < aiayArr2.length; i2++) {
                    aiay aiay = aiayArr2[i2];
                    networkLocationStatusArr[i2] = NetworkLocationStatus.a(a(aiay.a), a(aiay.b), aiay.c, aiay.d);
                }
                ivy.a((Iterable) Arrays.asList(networkLocationStatusArr), intent, "com.google.android.location.internal.LOCATION_STATUS");
            }
            if (!aipt.a(context, intent)) {
                String valueOf = String.valueOf(aipt);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb.append("dropping intent receiver");
                sb.append(valueOf);
                sb.toString();
                aicn aicn = this.c;
                if (aicn != null) {
                    aicn.a(aico.LOCATION_PENDING_INTENT_DROPPED, aipt.h.hashCode(), aipt.h.getTargetPackage());
                }
                it.remove();
                z = true;
            }
        }
        if (z) {
            a(this.a.values());
        }
    }

    public final void a(Collection collection) {
        ajrb ajrb;
        this.e = Long.MAX_VALUE;
        this.f = Long.MAX_VALUE;
        this.d = Long.MAX_VALUE;
        this.g = false;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            aipt aipt = (aipt) it.next();
            long j = aipt.q;
            this.g |= aipt.l;
            String valueOf = String.valueOf(aipt);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
            sb.append("Still have location intent receiver ");
            sb.append(valueOf);
            sb.toString();
            if (aipt.a) {
                this.e = Math.min(this.e, j);
            } else {
                this.d = Math.min(this.d, j);
            }
            long max = Math.max(aipt.i, j);
            long j2 = aipt.q;
            StringBuilder sb2 = new StringBuilder(83);
            sb2.append("Batch: this client period is ");
            sb2.append(j2);
            sb2.append(" and can wait ");
            sb2.append(max);
            sb2.toString();
            long min = Math.min(this.f, max);
            this.f = min;
            StringBuilder sb3 = new StringBuilder(53);
            sb3.append("Batch: minBatchIntervalMillis is ");
            sb3.append(min);
            sb3.toString();
        }
        long j3 = this.f;
        StringBuilder sb4 = new StringBuilder(44);
        sb4.append("BATCH: batchInterval is ");
        sb4.append(j3);
        sb4.toString();
        if (this.d <= this.e) {
            this.e = Long.MAX_VALUE;
        }
        this.h = new ajrc();
        double min2 = (double) Math.min(this.d, this.e);
        Double.isNaN(min2);
        long j4 = (long) (((min2 + 1.0d) * 3.0d) / 2.0d);
        for (aipt aipt2 : this.a.values()) {
            if (aipt2.q < j4 && (ajrb = aipt2.n) != null) {
                this.h.a(ajrb);
            }
        }
    }
}
