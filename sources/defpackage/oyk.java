package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.Thing;
import java.util.Arrays;

/* renamed from: oyk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oyk {
    public static Thing a(Thing thing) {
        String str;
        Thing thing2 = thing;
        boolean[] c = thing2.c.c("isGlobalSearchable");
        if (!(c == null || c.length == 0 || c[0])) {
            thing2.c.d.putLongArray("scope", new long[]{1});
        }
        if (thing2.a == 10 && !thing2.e.equals("Reservation")) {
            return thing2;
        }
        Bundle bundle = new Bundle(thing2.b);
        String str2 = thing2.e;
        if (str2.equals("Reservation")) {
            a(bundle, "startTime", "startDate");
        }
        for (String str3 : bundle.keySet()) {
            Object obj = bundle.get(str3);
            if (obj instanceof Parcelable[]) {
                Parcelable[] parcelableArr = (Parcelable[]) obj;
                Thing[] thingArr = new Thing[parcelableArr.length];
                for (int i = 0; i < parcelableArr.length; i++) {
                    thingArr[i] = a((Thing) parcelableArr[i]);
                }
                bundle.putParcelableArray(str3, thingArr);
            }
        }
        int i2 = thing2.a;
        if (i2 == 1) {
            if (thing2.e.equals("Person")) {
                a(bundle, "text", "email");
            }
            if (Arrays.asList(new String[]{"Document", "PresentationDocument", "NoteDocument", "TextDocument", "SpreadsheetDocument"}).contains(thing2.e)) {
                a(bundle, "hasDocumentPermission", "hasDigitalDocumentPermission");
            }
            String[] strArr = {"Document", "PresentationDocument", "NoteDocument", "TextDocument", "SpreadsheetDocument", "DocumentPermission"};
            String[] strArr2 = {"DigitalDocument", "PresentationDigitalDocument", "NoteDigitalDocument", "TextDigitalDocument", "SpreadsheetDigitalDocument", "DigitalDocumentPermission"};
            int i3 = 0;
            for (int i4 = 6; i3 < i4; i4 = 6) {
                if (thing2.e.equals(strArr[i3])) {
                    str2 = strArr2[i3];
                }
                i3++;
            }
        } else if (i2 != 2) {
            str = str2;
            return new Thing(thing2.a, bundle, thing2.c, thing2.d, str);
        }
        if (Arrays.asList(new String[]{"File", "PresentationFile", "NoteFile", "TextFile", "SpreadsheetFile"}).contains(thing2.e)) {
            a(bundle, "hasFilePermission", "hasDigitalDocumentPermission");
        }
        String[] strArr3 = {"File", "PresentationFile", "NoteFile", "TextFile", "SpreadsheetFile", "FilePermission"};
        String[] strArr4 = {"DigitalDocument", "PresentationDigitalDocument", "NoteDigitalDocument", "TextDigitalDocument", "SpreadsheetDigitalDocument", "DigitalDocumentPermission"};
        for (int i5 = 0; i5 < 6; i5++) {
            if (thing2.e.equals(strArr3[i5])) {
                str2 = strArr4[i5];
            }
        }
        str = str2;
        return new Thing(thing2.a, bundle, thing2.c, thing2.d, str);
    }

    private static void a(Bundle bundle, String str, String str2) {
        if (bundle.get(str) instanceof String[]) {
            bundle.putStringArray(str2, bundle.getStringArray(str));
            bundle.remove(str);
        } else if (bundle.get(str) instanceof Parcelable[]) {
            bundle.putParcelableArray(str2, bundle.getParcelableArray(str));
            bundle.remove(str);
        } else if (bundle.get(str) instanceof long[]) {
            bundle.putLongArray(str2, bundle.getLongArray(str));
            bundle.remove(str);
        }
    }
}
