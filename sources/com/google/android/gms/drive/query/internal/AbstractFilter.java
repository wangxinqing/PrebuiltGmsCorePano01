package com.google.android.gms.drive.query.internal;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.query.Filter;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class AbstractFilter extends AbstractSafeParcelable implements Filter {
    public final String toString() {
        return String.format("Filter[%s]", new Object[]{a(new liz())});
    }
}
