package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.KeyFilterImpl;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ContextDataFilterImpl extends AbstractSafeParcelable implements jtn, jwi, jxo {
    public static final Parcelable.Creator CREATOR = new jwf();
    public final ArrayList a;
    public final ArrayList b;
    public final QueryFilterParameters c;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class Inclusion extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new jwg();
        public final int a;
        public final int b;
        public final TimeFilterImpl c;
        public final KeyFilterImpl d;

        public Inclusion(int i, int i2, TimeFilterImpl timeFilterImpl, KeyFilterImpl keyFilterImpl) {
            this.a = i;
            this.b = i2;
            this.c = timeFilterImpl;
            this.d = keyFilterImpl;
        }

        public final boolean a() {
            return this.a != -1;
        }

        public final boolean b() {
            return this.b != -1;
        }

        public final boolean c() {
            return this.c != null;
        }

        public final boolean d() {
            return this.d != null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Inclusion) {
                Inclusion inclusion = (Inclusion) obj;
                return this.a == inclusion.a && this.b == inclusion.b && this.c.equals(inclusion.c) && ius.a(this.d, inclusion.d);
            }
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d});
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            ivx.b(parcel, 2, this.a);
            ivx.b(parcel, 3, this.b);
            ivx.a(parcel, 4, this.c, i, false);
            ivx.a(parcel, 5, this.d, i, false);
            ivx.b(parcel, a2);
        }
    }

    public ContextDataFilterImpl(ArrayList arrayList, ArrayList arrayList2, QueryFilterParameters queryFilterParameters) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = queryFilterParameters;
    }

    public final QueryFilterParameters a() {
        return this.c;
    }

    public final boolean b() {
        ArrayList arrayList = this.a;
        return arrayList != null && arrayList.size() > 0;
    }

    public final boolean c() {
        ArrayList arrayList = this.b;
        return arrayList != null && arrayList.size() > 0;
    }

    public final HashSet d() {
        ArrayList arrayList = this.a;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            hashSet.add(Integer.valueOf(((Inclusion) arrayList2.get(i)).b));
        }
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContextDataFilterImpl) {
            ContextDataFilterImpl contextDataFilterImpl = (ContextDataFilterImpl) obj;
            return ius.a(this.a, contextDataFilterImpl.a) && ius.a(this.b, contextDataFilterImpl.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("contexts=[");
        ArrayList arrayList = this.a;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = this.a;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                sb.append(((Inclusion) arrayList2.get(i)).b);
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 2, this.a, false);
        ivx.b(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c, i, false);
        ivx.b(parcel, a2);
    }

    public final boolean a(ContextData contextData) {
        if (c()) {
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (!TextUtils.equals((String) arrayList.get(i), contextData.e().c())) {
                    i = i2;
                }
            }
            return false;
        }
        if (b()) {
            ArrayList arrayList2 = this.a;
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                int i4 = i3 + 1;
                Inclusion inclusion = (Inclusion) arrayList2.get(i3);
                if ((!inclusion.a() || inclusion.a == contextData.f()) && (!inclusion.b() || inclusion.b == contextData.g())) {
                    if (inclusion.c()) {
                        if (contextData.j() != null) {
                            TimeFilterImpl timeFilterImpl = inclusion.c;
                            jxu j = contextData.j();
                            ArrayList arrayList3 = timeFilterImpl.a;
                            int size3 = arrayList3.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size3) {
                                    continue;
                                    break;
                                }
                                int i6 = i5 + 1;
                                jxu jxu = (TimeFilterImpl.Interval) arrayList3.get(i5);
                                long d = jxu.d() - jxu.c();
                                long d2 = j.d() - j.c();
                                jxu jxu2 = d > d2 ? jxu : j;
                                if (d > d2) {
                                    jxu = j;
                                }
                                long c2 = jxu2.c();
                                long d3 = jxu2.d();
                                long c3 = jxu.c();
                                long d4 = jxu.d();
                                if ((c3 >= c2 && c3 <= d3) || (d4 >= c2 && d4 <= d3)) {
                                    break;
                                }
                                i5 = i6;
                            }
                        } else {
                            bxl.b("ContextDataFilterImpl", "No context time specified for Context: [%s]", Integer.valueOf(contextData.g()));
                        }
                    }
                    if (inclusion.d()) {
                        KeyFilterImpl keyFilterImpl = inclusion.d;
                        jun l = contextData.l();
                        if (!keyFilterImpl.a.isEmpty()) {
                            ArrayList arrayList4 = keyFilterImpl.a;
                            int size4 = arrayList4.size();
                            int i7 = 0;
                            while (i7 < size4) {
                                KeyFilterImpl.Inclusion inclusion2 = (KeyFilterImpl.Inclusion) arrayList4.get(i7);
                                i7++;
                                if (l != null && KeyFilterImpl.a(l.b(), inclusion2.a) && KeyFilterImpl.a(l.d(), inclusion2.b) && KeyFilterImpl.a(l.f(), inclusion2.c)) {
                                }
                            }
                            continue;
                        }
                    }
                    return true;
                }
                i3 = i4;
            }
        }
        return false;
    }
}
