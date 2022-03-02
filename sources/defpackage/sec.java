package defpackage;

import com.google.android.gms.mdi.mobstore.MobStoreFileService;
import com.google.android.gms.mobstore.DeleteFileRequest;
import com.google.android.gms.mobstore.OpenFileDescriptorRequest;
import com.google.android.gms.mobstore.RenameRequest;

/* renamed from: sec  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sec extends tby implements niz {
    private final MobStoreFileService a;
    private final nix b;
    private final sdw c;
    private final String d;
    private final see e;
    private final agzt f;

    public sec(MobStoreFileService mobStoreFileService, nix nix, sdw sdw, String str, see see, agzt agzt) {
        this.a = mobStoreFileService;
        this.b = nix;
        this.c = sdw;
        this.d = str;
        this.e = see;
        this.f = agzt;
    }

    public final void a(tbw tbw, DeleteFileRequest deleteFileRequest) {
        this.b.a(this.a, new sdv(deleteFileRequest, tbw, this.c, this.d, this.e));
    }

    public final void a(tbw tbw, OpenFileDescriptorRequest openFileDescriptorRequest) {
        this.b.a(this.a, new sed(openFileDescriptorRequest, tbw, this.c, this.d, this.e, this.f));
    }

    public final void a(tbw tbw, RenameRequest renameRequest) {
        this.b.a(this.a, new seg(renameRequest, tbw, this.c, this.d, this.e));
    }
}
