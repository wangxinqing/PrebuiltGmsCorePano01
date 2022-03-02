package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class SnapshotMetadataEntity extends GamesAbstractSafeParcelable implements SnapshotMetadata {
    public static final Parcelable.Creator CREATOR = new nnm();
    public final GameEntity a;
    public final PlayerEntity b;
    public final String c;
    public final Uri d;
    public final String e;
    public final String f;
    public final String g;
    public final long h;
    public final long i;
    public final float j;
    public final String k;
    public final boolean l;
    public final long m;
    public final String n;

    public SnapshotMetadataEntity(GameEntity gameEntity, PlayerEntity playerEntity, String str, Uri uri, String str2, String str3, String str4, long j2, long j3, float f2, String str5, boolean z, long j4, String str6) {
        this.a = gameEntity;
        this.b = playerEntity;
        this.c = str;
        this.d = uri;
        this.e = str2;
        this.j = f2;
        this.f = str3;
        this.g = str4;
        this.h = j2;
        this.i = j3;
        this.k = str5;
        this.l = z;
        this.m = j4;
        this.n = str6;
    }

    public final Game a() {
        return this.a;
    }

    public final Player b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final Uri d() {
        return this.d;
    }

    public final float e() {
        return this.j;
    }

    public final String f() {
        return this.k;
    }

    public final String g() {
        return this.f;
    }

    public final String h() {
        return this.g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Float.valueOf(this.j), this.f, this.g, Long.valueOf(this.h), Long.valueOf(this.i), this.k, Boolean.valueOf(this.l), Long.valueOf(this.m), this.n});
    }

    public final long i() {
        return this.h;
    }

    public final long j() {
        return this.i;
    }

    public final boolean k() {
        return this.l;
    }

    public final long l() {
        return this.m;
    }

    public final String m() {
        return this.n;
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public SnapshotMetadataEntity(SnapshotMetadata snapshotMetadata) {
        SnapshotMetadataEntity snapshotMetadataEntity = (SnapshotMetadataEntity) snapshotMetadata;
        PlayerEntity playerEntity = new PlayerEntity(snapshotMetadataEntity.b);
        this.a = new GameEntity(snapshotMetadataEntity.a);
        this.b = playerEntity;
        this.c = snapshotMetadataEntity.c;
        this.d = snapshotMetadataEntity.d;
        this.e = snapshotMetadataEntity.e;
        this.j = snapshotMetadataEntity.j;
        this.f = snapshotMetadataEntity.f;
        this.g = snapshotMetadataEntity.g;
        this.h = snapshotMetadataEntity.h;
        this.i = snapshotMetadataEntity.i;
        this.k = snapshotMetadataEntity.k;
        this.l = snapshotMetadataEntity.l;
        this.m = snapshotMetadataEntity.m;
        this.n = snapshotMetadataEntity.n;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SnapshotMetadata) {
            if (this == obj) {
                return true;
            }
            SnapshotMetadata snapshotMetadata = (SnapshotMetadata) obj;
            if (!ius.a(snapshotMetadata.a(), this.a) || !ius.a(snapshotMetadata.b(), this.b) || !ius.a(snapshotMetadata.c(), this.c) || !ius.a(snapshotMetadata.d(), this.d) || !ius.a(Float.valueOf(snapshotMetadata.e()), Float.valueOf(this.j)) || !ius.a(snapshotMetadata.g(), this.f) || !ius.a(snapshotMetadata.h(), this.g) || !ius.a(Long.valueOf(snapshotMetadata.i()), Long.valueOf(this.h)) || !ius.a(Long.valueOf(snapshotMetadata.j()), Long.valueOf(this.i)) || !ius.a(snapshotMetadata.f(), this.k) || !ius.a(Boolean.valueOf(snapshotMetadata.k()), Boolean.valueOf(this.l)) || !ius.a(Long.valueOf(snapshotMetadata.l()), Long.valueOf(this.m)) || !ius.a(snapshotMetadata.m(), this.n)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("Game", this.a);
        a2.a("Owner", this.b);
        a2.a("SnapshotId", this.c);
        a2.a("CoverImageUri", this.d);
        a2.a("CoverImageUrl", this.e);
        a2.a("CoverImageAspectRatio", Float.valueOf(this.j));
        a2.a("Description", this.g);
        a2.a("LastModifiedTimestamp", Long.valueOf(this.h));
        a2.a("PlayedTime", Long.valueOf(this.i));
        a2.a("UniqueName", this.k);
        a2.a("ChangePending", Boolean.valueOf(this.l));
        a2.a("ProgressValue", Long.valueOf(this.m));
        a2.a("DeviceName", this.n);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i2, false);
        ivx.a(parcel, 2, this.b, i2, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 5, this.d, i2, false);
        ivx.a(parcel, 6, this.e, false);
        ivx.a(parcel, 7, this.f, false);
        ivx.a(parcel, 8, this.g, false);
        ivx.a(parcel, 9, this.h);
        ivx.a(parcel, 10, this.i);
        ivx.a(parcel, 11, this.j);
        ivx.a(parcel, 12, this.k, false);
        ivx.a(parcel, 13, this.l);
        ivx.a(parcel, 14, this.m);
        ivx.a(parcel, 15, this.n, false);
        ivx.b(parcel, a2);
    }
}
