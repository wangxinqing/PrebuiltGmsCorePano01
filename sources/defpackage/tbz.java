package defpackage;

import android.os.IInterface;
import com.google.android.gms.mobstore.DeleteFileRequest;
import com.google.android.gms.mobstore.OpenFileDescriptorRequest;
import com.google.android.gms.mobstore.RenameRequest;

/* renamed from: tbz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface tbz extends IInterface {
    void a(tbw tbw, DeleteFileRequest deleteFileRequest);

    void a(tbw tbw, OpenFileDescriptorRequest openFileDescriptorRequest);

    void a(tbw tbw, RenameRequest renameRequest);
}
