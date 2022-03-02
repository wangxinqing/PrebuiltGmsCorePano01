package com.google.android.gms.location.places;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.places.internal.PlaceEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class AbstractPlaceFilter extends AbstractSafeParcelable {
    static List a(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return Collections.emptyList();
        }
        return new ArrayList(collection);
    }

    public boolean a() {
        return false;
    }

    public abstract Set b();

    public abstract Set c();

    static Set a(List list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(new HashSet(list));
    }

    public final boolean a(rhq rhq) {
        if (a() && ((PlaceEntity) rhq).g) {
            return false;
        }
        Set b = b();
        if (!b.isEmpty() && !b.contains(((PlaceEntity) rhq).a)) {
            return false;
        }
        Set c = c();
        if (c.isEmpty()) {
            return true;
        }
        for (Integer contains : ((PlaceEntity) rhq).j) {
            if (c.contains(contains)) {
                return true;
            }
        }
        return false;
    }
}
