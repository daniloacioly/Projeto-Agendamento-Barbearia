import { Observable } from "rxjs";
import { DetailClientResponse, ListClientResponse, SaveClientRequest, SaveClientResponse, UpdadeClientResponse, UpdateClientRequest } from "./client.models";

export interface ICLientService{

    save(request: SaveClientRequest): Observable<SaveClientResponse>

    update(id: number, request: UpdateClientRequest): Observable<UpdadeClientResponse>

    delete(id: number): Observable<void>

    list(): Observable<ListClientResponse[]>

    findByID(id: number): Observable<DetailClientResponse>
    
}