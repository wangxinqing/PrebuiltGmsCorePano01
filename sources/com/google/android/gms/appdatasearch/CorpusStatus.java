package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CorpusStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dsk();
    public final boolean a;
    public final long b;
    public final long c;
    final long d;
    final Bundle e;
    public final String f;
    public final String g;

    CorpusStatus() {
        this(false, 0, 0, 0, (Bundle) null, (String) null, (String) null);
    }

    public final Map a() {
        HashMap hashMap = new HashMap();
        for (String str : this.e.keySet()) {
            int i = this.e.getInt(str, -1);
            if (i != -1) {
                hashMap.put(str, Integer.valueOf(i));
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CorpusStatus) {
            CorpusStatus corpusStatus = (CorpusStatus) obj;
            if (!ius.a(Boolean.valueOf(this.a), Boolean.valueOf(corpusStatus.a)) || !ius.a(Long.valueOf(this.b), Long.valueOf(corpusStatus.b)) || !ius.a(Long.valueOf(this.c), Long.valueOf(corpusStatus.c)) || !ius.a(Long.valueOf(this.d), Long.valueOf(corpusStatus.d)) || !ius.a(a(), corpusStatus.a()) || !ius.a(this.g, corpusStatus.g)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d), a(), this.g});
    }

    public final String toString() {
        boolean z = this.a;
        String str = this.g;
        long j = this.b;
        long j2 = this.c;
        long j3 = this.d;
        String valueOf = String.valueOf(this.e);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 181 + String.valueOf(valueOf).length());
        sb.append("CorpusStatus{found=");
        sb.append(z);
        sb.append(", contentIncarnation=");
        sb.append(str);
        sb.append(", lastIndexedSeqno=");
        sb.append(j);
        sb.append(", lastCommittedSeqno=");
        sb.append(j2);
        sb.append(", committedNumDocuments=");
        sb.append(j3);
        sb.append(", counters=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public CorpusStatus(boolean z, long j, long j2, long j3, Bundle bundle, String str, String str2) {
        this.a = z;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = bundle == null ? new Bundle() : bundle;
        this.f = str;
        this.g = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e, false);
        ivx.a(parcel, 6, this.f, false);
        ivx.a(parcel, 7, this.g, false);
        ivx.b(parcel, a2);
    }
}
