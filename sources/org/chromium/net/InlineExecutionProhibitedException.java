package org.chromium.net;

import java.util.concurrent.RejectedExecutionException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class InlineExecutionProhibitedException extends RejectedExecutionException {
    public InlineExecutionProhibitedException() {
        super("Inline execution is prohibited for this request");
    }
}
