package com.google.android.places;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class Subscription extends AbstractSafeParcelable implements ReflectedParcelable {
    public akhu f;

    public abstract akhu a(Context context, akit akit, akhm akhm);

    public abstract Status a(int i);

    public abstract String a();

    public abstract boolean a(Subscription subscription);
}
