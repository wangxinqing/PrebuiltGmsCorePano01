package org.chromium.net;

import org.chromium.net.BidirectionalStream;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ExperimentalBidirectionalStream extends BidirectionalStream {

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public abstract class Builder extends BidirectionalStream.Builder {
        public abstract Builder addHeader(String str, String str2);

        public Builder addRequestAnnotation(Object obj) {
            return this;
        }

        public abstract ExperimentalBidirectionalStream build();

        public abstract Builder delayRequestHeadersUntilFirstFlush(boolean z);

        public abstract Builder setHttpMethod(String str);

        public abstract Builder setPriority(int i);

        public Builder setTrafficStatsTag(int i) {
            return this;
        }

        public Builder setTrafficStatsUid(int i) {
            return this;
        }
    }
}
