package com.google.android.gms.people.identity.models;

import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface Person extends Parcelable, wzq {

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface Emails extends MetadataHolder, Parcelable, wzj {
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface Images extends MetadataHolder, Parcelable, wzk {
        ImageReference g();
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface Memberships extends MetadataHolder, Parcelable, wzl {
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface Metadata extends Parcelable, wzm {
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface MetadataHolder extends Parcelable, wzn {
        Metadata b();
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface Names extends MetadataHolder, Parcelable, wzo {
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface PhoneNumbers extends MetadataHolder, Parcelable, wzp {
    }
}
