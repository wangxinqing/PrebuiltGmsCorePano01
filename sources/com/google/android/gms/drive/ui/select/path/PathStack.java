package com.google.android.gms.drive.ui.select.path;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PathStack implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new lqd();
    public static final ith a = new ith("PathStack", "");
    public static final PathElement b = RootPathElement.a;
    public List c;
    public DriveId d;
    private Set e;

    public PathStack() {
        this(a((PathElement) lqj.a));
    }

    public static ArrayList a(PathElement pathElement) {
        return new ArrayList(amzy.a((Object) pathElement));
    }

    public final PathElement b() {
        if (this.c.isEmpty()) {
            return null;
        }
        List list = this.c;
        return (PathElement) list.get(list.size() - 1);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.c.isEmpty() ^ true ? (byte) 1 : 0);
        if (this.c.isEmpty()) {
            parcel.writeParcelable(this.d, i);
        } else {
            parcel.writeList(this.c);
        }
    }

    public PathStack(DriveId driveId) {
        this(new ArrayList());
        this.d = driveId;
    }

    public final void a() {
        iva.a(!this.c.isEmpty(), (Object) "Not initialized yet");
        for (lqf a2 : this.e) {
            a2.a(b());
        }
    }

    public PathStack(ArrayList arrayList) {
        this.c = arrayList;
        this.e = new HashSet();
    }

    public final void a(SearchPathElement searchPathElement) {
        iva.a(!this.c.isEmpty(), (Object) "Not initialized yet");
        this.c.add(searchPathElement);
        a();
    }

    public final void b(lqf lqf) {
        this.e.remove(lqf);
    }

    public final void a(icc icc) {
        boolean z;
        iva.a(!this.c.isEmpty(), (Object) "Not initialized yet");
        if (b() != b) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z, (Object) "Can't pop the root path element");
        if (this.c.size() > 1) {
            List list = this.c;
            list.remove(list.size() - 1);
            a();
        } else if (this.c.get(0) instanceof FolderPathElement) {
            FolderPathElement folderPathElement = (FolderPathElement) this.c.get(0);
            icc.a((idf) new kvk(folderPathElement.a.c(), icc)).a((icm) new lqe(this, jzf.e.a(icc).a, folderPathElement.c, folderPathElement.b));
        } else {
            this.c.set(0, b);
            a();
        }
    }

    public final void a(jzr jzr) {
        boolean z = true;
        iva.a(!this.c.isEmpty(), (Object) "Not initialized yet");
        if (b() == b) {
            z = false;
        }
        iva.a(z, (Object) "Can't push a folder on top of the root path element");
        this.c.add(new FolderPathElement(jzr));
        a();
    }

    public final void a(lqf lqf) {
        this.e.add(lqf);
        if (!this.c.isEmpty()) {
            lqf.a(b());
        }
    }
}
