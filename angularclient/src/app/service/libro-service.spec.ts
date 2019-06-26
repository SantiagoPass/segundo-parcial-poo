import { TestBed } from '@angular/core/testing';

import { LibroServiceService } from './libro-service.service';

describe('LibroServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: LibroServiceService = TestBed.get(LibroServiceService);
    expect(service).toBeTruthy();
  });
});
