package defpackage;

import com.google.android.gms.drive.DriveSpace;
import java.util.Iterator;
import java.util.Set;

/* renamed from: lsn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lsn {
    public static Set a(khq khq, Set set) {
        Set set2 = khq.e;
        if (set.isEmpty()) {
            ob obVar = new ob();
            if (set2.contains(jzl.FULL) || set2.contains(jzl.FILE)) {
                obVar.add(DriveSpace.a);
            }
            if (set2.contains(jzl.APPDATA)) {
                obVar.add(DriveSpace.b);
            }
            if (!obVar.isEmpty()) {
                return obVar;
            }
            throw new nja(10, "The scopes requested imply no spaces. Request more scopes or explicitly request some spaces");
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            DriveSpace driveSpace = (DriveSpace) it.next();
            if (DriveSpace.a.equals(driveSpace)) {
                if (!set2.contains(jzl.FULL) && !set2.contains(jzl.FILE)) {
                    throw new nja(10, "Can't request the DRIVE space without FILE scope");
                }
            } else if (DriveSpace.b.equals(driveSpace)) {
                if (!set2.contains(jzl.APPDATA)) {
                    throw new nja(10, "Can't request the APP_DATA_FOLDER space without APPFOLDER scope");
                }
            } else if (!DriveSpace.c.equals(driveSpace)) {
                String valueOf = String.valueOf(driveSpace);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("Unrecognized space: ");
                sb.append(valueOf);
                throw new nja(10, sb.toString());
            } else if (!khq.b()) {
                throw new nja(10, "The PHOTOS space is exclusive to the Google Drive app");
            }
        }
        return set;
    }
}
