package br.com.moip.response;

import br.com.moip.resource.Links;
import br.com.moip.resource.Transfer;
import br.com.moip.resource.invoice.Summary;

import java.util.List;

public class TransferListResponse {

    public static final String NEXT = "next";
    public static final String PREVIOUS = "previous";

    private List<Transfer> transfers;
    private Summary summary;
    private Links _links;

    public String next() {
        return _links.getLinks().get(NEXT).toString();
    }

    public String previous() {
        return _links.getLinks().get(PREVIOUS).toString();
    }

    public List<Transfer> getTransfers() {
        return transfers;
    }

    public void setTransfers(List<Transfer> transfers) {
        this.transfers = transfers;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TransferListResponse{");
        sb.append("summary=").append(summary);
        sb.append(", transfers=").append(transfers);
        sb.append('}');
        return sb.toString();
    }
}
