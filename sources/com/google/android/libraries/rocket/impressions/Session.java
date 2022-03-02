package com.google.android.libraries.rocket.impressions;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class Session implements Parcelable {
    public static final Parcelable.Creator CREATOR = new agyi();
    public static final long a = TimeUnit.DAYS.toNanos(14);
    public final ArrayList b;
    public agyj c;
    public final alzu d;
    public final alzq e;
    public long f;
    public long g;
    public long h;
    public long i;
    public final aucd j;

    public Session(agyl agyl, agyk agyk) {
        this.b = new ArrayList();
        this.d = alzu.a;
        this.j = alzs.e.o();
        int i2 = agyk.a;
        if (i2 == 0 || i2 == 1) {
            throw new IllegalArgumentException("must set a valid SessionType");
        }
        aucd aucd = this.j;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        alzs alzs = (alzs) aucd.b;
        alzs.d = i2 - 1;
        alzs.a |= 32;
        aucd o = alzq.c.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        alzq alzq = (alzq) o.b;
        alzq.b = 3;
        alzq.a = 1 | alzq.a;
        this.e = (alzq) o.i();
        a(agyl);
    }

    private static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            Session session = (Session) obj;
            if (!a(this.b, session.b) || !a(this.c, session.c) || !a(this.d, session.d) || !a(this.j.i(), session.j.i()) || !a(this.e, session.e) || !a(Long.valueOf(this.f), Long.valueOf(session.f)) || !a(Long.valueOf(this.g), Long.valueOf(session.g)) || !a(Long.valueOf(this.h), Long.valueOf(session.h)) || !a(Long.valueOf(this.i), Long.valueOf(session.i))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.asList(new Object[]{this.b, this.c, this.d, this.j.i(), this.e, Long.valueOf(this.f), Long.valueOf(this.g), Long.valueOf(this.h), Long.valueOf(this.i)}).hashCode();
    }

    public final String toString() {
        return String.format("Session[queue=%s, status=%s, cilentInfo=%s, sessionInfo=%s, systemInfo=%s, currSeqNum=%s, lastHeartbeatSeqNum=%s, lastHeartbeatClientTimeUsec=%s, sessionStartTimeNsec=%s]", new Object[]{this.b, this.c, this.d, this.j.i(), this.e, Long.valueOf(this.f), Long.valueOf(this.h), Long.valueOf(this.h), Long.valueOf(this.i)});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        if (this.b.isEmpty()) {
            parcel.writeByteArray(this.d.k());
            parcel.writeByteArray(((alzs) this.j.i()).k());
            parcel.writeByteArray(this.e.k());
            parcel.writeLong(this.f);
            parcel.writeLong(this.g);
            parcel.writeLong(this.h);
            parcel.writeLong(this.i);
            parcel.writeString(this.c.name());
            return;
        }
        throw new IllegalStateException("cannot writeToParcel with impression to be flush");
    }

    public final void a(agyl agyl) {
        aucd aucd = this.j;
        String uuid = UUID.randomUUID().toString();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        alzs alzs = (alzs) aucd.b;
        alzs alzs2 = alzs.e;
        uuid.getClass();
        alzs.a |= 1;
        alzs.b = uuid;
        aucd aucd2 = this.j;
        long a2 = agyl.a();
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        alzs alzs3 = (alzs) aucd2.b;
        alzs3.a |= 2;
        alzs3.c = a2;
        this.i = agyl.b();
        this.f = 1;
        this.c = agyj.NOT_STARTED;
    }

    public Session(Parcel parcel) {
        this.b = new ArrayList();
        try {
            this.d = (alzu) aucj.a((aucj) alzu.a, parcel.createByteArray(), aubs.c());
            aucd o = alzs.e.o();
            o.b(parcel.createByteArray(), aubs.c());
            this.j = o;
            this.e = (alzq) aucj.a((aucj) alzq.c, parcel.createByteArray(), aubs.c());
            this.f = parcel.readLong();
            this.g = parcel.readLong();
            this.h = parcel.readLong();
            this.i = parcel.readLong();
            this.c = agyj.a(parcel.readString());
        } catch (auda e2) {
            throw new RuntimeException(e2);
        }
    }
}
