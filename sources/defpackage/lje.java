package defpackage;

import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Set;

/* renamed from: lje  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lje {
    public static kyq a(MetadataBundle metadataBundle) {
        Set c = metadataBundle.c();
        if (c.size() == 1) {
            return (kyq) c.iterator().next();
        }
        throw new IllegalArgumentException("bundle should have exactly 1 populated field");
    }
}
