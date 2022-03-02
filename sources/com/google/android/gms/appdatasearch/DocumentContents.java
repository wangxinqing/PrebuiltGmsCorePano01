package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.BitSet;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DocumentContents extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dsm();
    public final DocumentSection[] a;
    public final String b;
    public final boolean c;
    public final Account d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DocumentContents(Account account, DocumentSection... documentSectionArr) {
        this(documentSectionArr, (String) null, false, account);
        if (documentSectionArr != null) {
            BitSet bitSet = new BitSet(dtb.a());
            for (DocumentSection documentSection : documentSectionArr) {
                int i = documentSection.e;
                if (i != -1) {
                    if (!bitSet.get(i)) {
                        bitSet.set(i);
                    } else {
                        String valueOf = String.valueOf(dtb.a(i));
                        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Duplicate global search section type ") : "Duplicate global search section type ".concat(valueOf));
                    }
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DocumentContents) {
            DocumentContents documentContents = (DocumentContents) obj;
            return ius.a(this.b, documentContents.b) && ius.a(Boolean.valueOf(this.c), Boolean.valueOf(documentContents.c)) && ius.a(this.d, documentContents.d) && Arrays.equals(this.a, documentContents.a);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Boolean.valueOf(this.c), this.d, Integer.valueOf(Arrays.hashCode(this.a))});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, (Parcelable[]) this.a, i);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d, i, false);
        ivx.b(parcel, a2);
    }

    public DocumentContents(DocumentSection[] documentSectionArr, String str, boolean z, Account account) {
        this.a = documentSectionArr;
        this.b = str;
        this.c = z;
        this.d = account;
    }
}
