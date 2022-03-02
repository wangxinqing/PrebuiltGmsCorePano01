package defpackage;

import android.database.CursorWindow;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.realtime.internal.ParcelableChangeInfo;
import com.google.android.gms.drive.realtime.internal.event.FieldChangedDetails;
import com.google.android.gms.drive.realtime.internal.event.ObjectChangedDetails;
import com.google.android.gms.drive.realtime.internal.event.ParcelableEvent;
import com.google.android.gms.drive.realtime.internal.event.ParcelableEventList;
import com.google.android.gms.drive.realtime.internal.event.ReferenceShiftedDetails;
import com.google.android.gms.drive.realtime.internal.event.TextDeletedDetails;
import com.google.android.gms.drive.realtime.internal.event.TextInsertedDetails;
import com.google.android.gms.drive.realtime.internal.event.ValueChangedDetails;
import com.google.android.gms.drive.realtime.internal.event.ValuesAddedDetails;
import com.google.android.gms.drive.realtime.internal.event.ValuesRemovedDetails;
import com.google.android.gms.drive.realtime.internal.event.ValuesSetDetails;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: ljs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ljs {
    private static final String a = aluv.a(aluv.a);
    private final List b = new ArrayList();
    private final List c = new ArrayList();
    private final alsg d;
    private ParcelableChangeInfo e;
    private boolean f;
    private boolean g = false;
    private lmt h = null;

    public ljs(alsg alsg) {
        this.d = alsg;
    }

    private static int a(lmt lmt, Object obj) {
        int i = lmt.b;
        lmt.a(obj);
        return i;
    }

    private static int a(lmt lmt, List list) {
        int i = lmt.b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lmt.a((amjf) it.next());
        }
        return i;
    }

    private final ParcelableEvent a(altj altj) {
        String str;
        int i;
        String str2;
        int i2;
        altj altj2 = altj;
        if (this.h == null) {
            this.h = new lmt(new llu(this.d));
        }
        alss alss = altj2.b;
        String str3 = alss.a;
        List list = altj2.c;
        boolean a2 = alss.a();
        int i3 = altj2.b.b;
        boolean z = (i3 & 4) != 0;
        boolean z2 = (i3 & 8) != 0;
        alsk alsk = altj2.a;
        String d2 = alsk.d();
        if (altj2 instanceof altn) {
            altn altn = (altn) altj2;
            TextInsertedDetails textInsertedDetails = r3;
            TextInsertedDetails textInsertedDetails2 = new TextInsertedDetails(altn.d, a(this.h, (Object) altn.e));
            return new ParcelableEvent(str3, "", list, a2, z, z2, d2, "EditableString", textInsertedDetails, (TextDeletedDetails) null, (ValuesAddedDetails) null, (ValuesRemovedDetails) null, (ValuesSetDetails) null, (ValueChangedDetails) null, (ReferenceShiftedDetails) null, (ObjectChangedDetails) null, (FieldChangedDetails) null);
        } else if (altj2 instanceof altm) {
            altm altm = (altm) altj2;
            TextDeletedDetails textDeletedDetails = r3;
            TextDeletedDetails textDeletedDetails2 = new TextDeletedDetails(altm.d, a(this.h, (Object) altm.e));
            return new ParcelableEvent(str3, "", list, a2, z, z2, d2, "EditableString", (TextInsertedDetails) null, textDeletedDetails, (ValuesAddedDetails) null, (ValuesRemovedDetails) null, (ValuesSetDetails) null, (ValueChangedDetails) null, (ReferenceShiftedDetails) null, (ObjectChangedDetails) null, (FieldChangedDetails) null);
        } else if (altj2 instanceof altp) {
            altp altp = (altp) altj2;
            int a3 = a(this.h, altp.e);
            alsi alsi = altp.f;
            if (alsi != null) {
                str2 = alsi.d();
            } else {
                str2 = null;
            }
            int i4 = altp.d;
            int size = altp.e.size();
            Integer num = altp.g;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = -1;
            }
            return new ParcelableEvent(str3, "", list, a2, z, z2, d2, "EditableString", (TextInsertedDetails) null, (TextDeletedDetails) null, new ValuesAddedDetails(i4, a3, size, str2, i2), (ValuesRemovedDetails) null, (ValuesSetDetails) null, (ValueChangedDetails) null, (ReferenceShiftedDetails) null, (ObjectChangedDetails) null, (FieldChangedDetails) null);
        } else if (altj2 instanceof altq) {
            altq altq = (altq) altj2;
            int a4 = a(this.h, altq.e);
            alsi alsi2 = altq.f;
            if (alsi2 != null) {
                str = alsi2.d();
            } else {
                str = null;
            }
            int i5 = altq.d;
            int size2 = altq.e.size();
            Integer num2 = altq.g;
            if (num2 != null) {
                i = num2.intValue();
            } else {
                i = -1;
            }
            return new ParcelableEvent(str3, "", list, a2, z, z2, d2, "EditableString", (TextInsertedDetails) null, (TextDeletedDetails) null, (ValuesAddedDetails) null, new ValuesRemovedDetails(i5, a4, size2, str, i), (ValuesSetDetails) null, (ValueChangedDetails) null, (ReferenceShiftedDetails) null, (ObjectChangedDetails) null, (FieldChangedDetails) null);
        } else if (altj2 instanceof altr) {
            altr altr = (altr) altj2;
            int a5 = a(this.h, altr.f);
            a(this.h, altr.e);
            ValuesSetDetails valuesSetDetails = r8;
            ValuesSetDetails valuesSetDetails2 = new ValuesSetDetails(altr.d, a5, altr.f.size());
            return new ParcelableEvent(str3, "", list, a2, z, z2, d2, "EditableString", (TextInsertedDetails) null, (TextDeletedDetails) null, (ValuesAddedDetails) null, (ValuesRemovedDetails) null, valuesSetDetails, (ValueChangedDetails) null, (ReferenceShiftedDetails) null, (ObjectChangedDetails) null, (FieldChangedDetails) null);
        } else if (altj2 instanceof alto) {
            alto alto = (alto) altj2;
            int a6 = a(this.h, (Object) alto.d);
            a(this.h, (Object) alto.e);
            a(this.h, (Object) alto.f);
            String f2 = altj2.a.f();
            if (f2.equals(a)) {
                ValueChangedDetails valueChangedDetails = r1;
                ValueChangedDetails valueChangedDetails2 = new ValueChangedDetails(a6);
                return new ParcelableEvent(str3, "", list, a2, z, z2, d2, "Map", (TextInsertedDetails) null, (TextDeletedDetails) null, (ValuesAddedDetails) null, (ValuesRemovedDetails) null, (ValuesSetDetails) null, valueChangedDetails, (ReferenceShiftedDetails) null, (ObjectChangedDetails) null, (FieldChangedDetails) null);
            }
            FieldChangedDetails fieldChangedDetails = r1;
            FieldChangedDetails fieldChangedDetails2 = new FieldChangedDetails(a6);
            return new ParcelableEvent(str3, "", list, a2, z, z2, d2, f2, (TextInsertedDetails) null, (TextDeletedDetails) null, (ValuesAddedDetails) null, (ValuesRemovedDetails) null, (ValuesSetDetails) null, (ValueChangedDetails) null, (ReferenceShiftedDetails) null, (ObjectChangedDetails) null, fieldChangedDetails);
        } else if (altj2 instanceof altl) {
            altl altl = (altl) altj2;
            ReferenceShiftedDetails referenceShiftedDetails = r3;
            ReferenceShiftedDetails referenceShiftedDetails2 = new ReferenceShiftedDetails(altl.g, altl.d, altl.f, altl.e);
            return new ParcelableEvent(str3, "", list, a2, z, z2, d2, "IndexReference", (TextInsertedDetails) null, (TextDeletedDetails) null, (ValuesAddedDetails) null, (ValuesRemovedDetails) null, (ValuesSetDetails) null, (ValueChangedDetails) null, referenceShiftedDetails, (ObjectChangedDetails) null, (FieldChangedDetails) null);
        } else if (altj2 instanceof altk) {
            List<alsk> list2 = ((altk) altj2).e;
            int i6 = this.h.b;
            for (alsk d3 : list2) {
                a(this.h, (Object) d3.d());
            }
            ObjectChangedDetails objectChangedDetails = r8;
            ObjectChangedDetails objectChangedDetails2 = new ObjectChangedDetails(i6, list2.size());
            return new ParcelableEvent(str3, "", list, a2, z, z2, d2, "IndexReference", (TextInsertedDetails) null, (TextDeletedDetails) null, (ValuesAddedDetails) null, (ValuesRemovedDetails) null, (ValuesSetDetails) null, (ValueChangedDetails) null, (ReferenceShiftedDetails) null, objectChangedDetails, (FieldChangedDetails) null);
        } else {
            return new ParcelableEvent(str3, "", list, a2, z, z2, d2, alsk.f(), (TextInsertedDetails) null, (TextDeletedDetails) null, (ValuesAddedDetails) null, (ValuesRemovedDetails) null, (ValuesSetDetails) null, (ValueChangedDetails) null, (ReferenceShiftedDetails) null, (ObjectChangedDetails) null, (FieldChangedDetails) null);
        }
    }

    public final ParcelableEventList a() {
        DataHolder dataHolder;
        this.g = true;
        lmt lmt = this.h;
        if (lmt != null) {
            lmu lmu = lmt.c;
            List list = lmt.a;
            dataHolder = lmu.a((CursorWindow[]) list.toArray(new CursorWindow[list.size()]));
        } else {
            dataHolder = null;
        }
        return new ParcelableEventList(this.b, dataHolder, this.f, this.c, this.e);
    }

    public final void a(alse alse) {
        a(alse, true);
    }

    public final void a(alse alse, boolean z) {
        boolean z2 = true;
        iva.a(!this.g, (Object) "build() has already been called");
        List<altj> list = alse.b;
        Collection<altj> collection = alse.c;
        for (altj a2 : list) {
            this.b.add(a(a2));
        }
        for (altj a3 : collection) {
            this.b.add(a(a3));
        }
        if (z) {
            for (alsk d2 : alse.d) {
                this.c.add(d2.d());
            }
        }
        if (alse.h != null) {
            if (this.e != null) {
                z2 = false;
            }
            iva.a(z2, (Object) "Cannot overwrite non-null previous change.");
            ArrayList arrayList = new ArrayList();
            for (altj a4 : alse.h.b) {
                arrayList.add(a(a4));
            }
            this.e = new ParcelableChangeInfo(alse.h.a, arrayList);
        }
        this.f = alse.e.c.contains(alsv.UNDO_REDO_STATE_CHANGED) | this.f;
    }
}
