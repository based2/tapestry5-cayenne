package com.googlecode.tapestry5cayenne.model.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

import com.googlecode.tapestry5cayenne.model.Artist;
import com.googlecode.tapestry5cayenne.model.Bid;

/**
 * Class _AcceptedBid was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AcceptedBid extends CayenneDataObject {

    private static final long serialVersionUID = -7308162828211466314L;
    public static final String ACCEPTED_DATE_PROPERTY = "acceptedDate";
    public static final String ACCEPTOR_PROPERTY = "acceptor";
    public static final String BID_PROPERTY = "bid";

    public static final String ARTISTID_PK_COLUMN = "artistid";
    public static final String BIDID_PK_COLUMN = "bidid";

    public void setAcceptedDate(Date acceptedDate) {
        writeProperty("acceptedDate", acceptedDate);
    }
    public Date getAcceptedDate() {
        return (Date)readProperty("acceptedDate");
    }

    public void setAcceptor(Artist acceptor) {
        setToOneTarget("acceptor", acceptor, true);
    }

    public Artist getAcceptor() {
        return (Artist)readProperty("acceptor");
    }


    public void setBid(Bid bid) {
        setToOneTarget("bid", bid, true);
    }

    public Bid getBid() {
        return (Bid)readProperty("bid");
    }


}
